package com.ifountain.opsgenie.client.marid.alert;

import com.ifountain.opsgenie.client.marid.MaridConfig;
import com.ifountain.opsgenie.client.script.OpsgenieClientApplicationConstants;
import com.ifountain.opsgenie.client.script.ScriptManager;
import com.ifountain.opsgenie.client.script.util.ScriptProxy;
import com.ifountain.opsgenie.client.util.JsonUtils;
import org.apache.commons.lang.StringUtils;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class AlertActionUtils {
    public static void executeActionScript(AlertActionBean actionBean) throws Exception {
        File scriptFile = getScriptFile(actionBean.action);
        if (scriptFile != null) {
            Map<String, Object> bindings = new HashMap<String, Object>();
            bindings.put(OpsgenieClientApplicationConstants.ScriptProxy.BINDING_ALERT, actionBean.alertProps);
            bindings.put(OpsgenieClientApplicationConstants.ScriptProxy.BINDING_SOURCE, actionBean.sources);
            bindings.put(OpsgenieClientApplicationConstants.ScriptProxy.BINDING_ACTION, actionBean.action);
            Properties  maridConfProps = new Properties();
            if(MaridConfig.getInstance().getConfiguration() != null){
                maridConfProps.putAll(MaridConfig.getInstance().getConfiguration());
            }
            bindings.put(OpsgenieClientApplicationConstants.ScriptProxy.BINDING_CONF, maridConfProps);
            bindings.put(OpsgenieClientApplicationConstants.ScriptProxy.BINDING_OPSGENIE_CLIENT, new ScriptProxy(MaridConfig.getInstance().getOpsGenieClient(), MaridConfig.getInstance().getCustomerKey()));
            ScriptManager.getInstance().runScript(scriptFile.getName(), bindings);
        } else {
            throw new Exception("No script file found for action [" + actionBean.action + "]");
        }
    }

    public static File getScriptFile(String action) {
        String safeFileName = action.replaceAll("\\W", "");
        String propertyKey = "actions."+safeFileName+".script".toLowerCase();
        String fileName = MaridConfig.getInstance().getLowercasedConfiguration().get(propertyKey);
        File scriptsDirectory = ScriptManager.getInstance().getScriptsDirectory();
        if(fileName == null){
            fileName = safeFileName;
            File[] files = scriptsDirectory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (StringUtils.substringBeforeLast(file.getName(), ".").equalsIgnoreCase(fileName)) {
                        return file;
                    }
                }
            }
        }
        else{
            File scriptFile = new File(scriptsDirectory, fileName);
            if(scriptFile.exists()){
                return scriptFile;
            }
        }

        return null;
    }

    public static class AlertActionBean {
        public static final String ACTION = "action";
        public static final String ALERT = "alert";
        public static final String SOURCE = "source";
        public static final String SOURCES = "sources";
        public String action;
        public List sources;
        public Map alertProps;
        public String alertId;
        public String username;

        public AlertActionBean(String action, Map alertProps, List sources) {
            this.action = action;
            this.sources = sources;
            this.alertProps = alertProps;
            alertId = (String) this.alertProps.get("alertId");
            username = (String) this.alertProps.get("username");
        }

        public static AlertActionBean createAlertAction(String jsonMessage) throws Exception {
            Map jsonMessageMap = null;
            try {
                jsonMessageMap = JsonUtils.parse(jsonMessage);
            } catch (IOException e) {
                throw new IllegalArgumentException("Could not parse message:"+jsonMessage);
            }
            return createAlertAction(jsonMessageMap);
        }

        public static AlertActionBean createAlertAction(Map jsonMessageMap) throws Exception {
            String action = (String) jsonMessageMap.get(ACTION);
            Object alert = jsonMessageMap.get(ALERT);
            Object source = jsonMessageMap.get(SOURCE);
            try{
                return createAlertAction(action, alert, source);
            }
            catch (IllegalArgumentException ex){
                throw new IllegalArgumentException(ex.getMessage()+" Ignoring message :"+jsonMessageMap);
            }
        }

        public static AlertActionBean createAlertAction(JSONObject jsonMessageMap) throws Exception {
            String action=null;
            String alert = null;
            String source = null;
            if(jsonMessageMap.has(ACTION))
            action = (String) jsonMessageMap.get(ACTION);
            if(jsonMessageMap.has(ALERT))
            alert = (String) jsonMessageMap.get(ALERT);
            if(jsonMessageMap.has(SOURCE))
                source = (String) jsonMessageMap.get(SOURCE);
            try{
                return createAlertAction(action, alert, source);
            }
            catch (IllegalArgumentException ex){
                throw new IllegalArgumentException(ex.getMessage()+" Ignoring message :"+jsonMessageMap);
            }
        }

        public static AlertActionBean createAlertAction(String action, Object alert, Object source) throws Exception {
            if(action == null){
                throw new IllegalArgumentException("No action specified.");
            }
            if(alert == null){
                throw new IllegalArgumentException("No alert specified.");
            }
            List sourceList =null;
            Map alertMap;
            try {
                if(alert instanceof Map){
                    alertMap = (Map) alert;
                }
                else{
                    alertMap = JsonUtils.parse(String.valueOf(alert));
                }
                if(source != null){
                    if(source instanceof List){
                        sourceList = (List) source;
                    }
                    else{
                        sourceList = (List) JsonUtils.parse(String.valueOf(alert)).get(SOURCES);
                    }
                }

            } catch (IOException e) {
                throw new IllegalArgumentException("Could not parse alert content.");
            }
            return new AlertActionBean(action, alertMap, sourceList);
        }
    }
}
