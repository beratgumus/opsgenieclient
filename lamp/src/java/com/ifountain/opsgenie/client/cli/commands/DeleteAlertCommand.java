package com.ifountain.opsgenie.client.cli.commands;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import com.beust.jcommander.ParametersDelegate;
import com.ifountain.opsgenie.client.IOpsGenieClient;
import com.ifountain.opsgenie.client.OpsGenieClientConstants;
import com.ifountain.opsgenie.client.model.DeleteAlertRequest;

/**
 * @author Sezgin Kucukkaraaslan
 * @version 12/4/12 3:57 PM
 */
@Parameters(commandDescription = "Deletes an alert at OpsGenie.")
public class DeleteAlertCommand extends BaseCommand{
    @ParametersDelegate
    private CommonCommandOptions commonOptions = new CommonCommandOptions();

    @Parameter(names = "--" + OpsGenieClientConstants.API.ALERT_ID, description = "Id of the alert that will be deleted.", splitter = NullSplitter.class)
    private String alertId;

    public DeleteAlertCommand(JCommander commander) {
        super(commander);
    }

    @Override
    public String getName() {
        return "deleteAlert";
    }

    @Override
    protected CommonCommandOptions getCommonCommandOptions() {
        return commonOptions;
    }

    @Override
    public void doExecute(IOpsGenieClient opsGenieClient) throws Exception {
        DeleteAlertRequest request = new DeleteAlertRequest();
        request.setCustomerKey(commonOptions.getCustomerKey());
        request.setAlertId(alertId);
        if (commonOptions.getUser() != null) request.setUser(commonOptions.getUser());
        opsGenieClient.deleteAlert(request);
    }
}
