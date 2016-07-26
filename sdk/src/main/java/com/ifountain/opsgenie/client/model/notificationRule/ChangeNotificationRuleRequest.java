package com.ifountain.opsgenie.client.model.notificationRule;

import java.util.Map;

import com.ifountain.opsgenie.client.OpsGenieClientConstants;
import com.ifountain.opsgenie.client.OpsGenieClientValidationException;
import com.ifountain.opsgenie.client.model.BaseRequest;
/**
 * Container for the parameters to repeat notificationRule api call.
 *
 * @see com.ifountain.opsgenie.client.INotificationRuleOpsGenieClient#changeNotificationRule(ChangeNotificationRuleRequest)
 */
public class ChangeNotificationRuleRequest extends BaseRequest<ChangeNotificationRuleResponse> {
	private String username;
	private String userId;
	private String id;
	private Integer applyOrder;
    /**
     * Rest api uri of change notificationRule operation.
     */
	@Override
	public String getEndPoint() {
		return "/v1/json/user/notificationRule/changeOrder";
	}
	@Override
    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#serialize()
     */
	public Map serialize() throws OpsGenieClientValidationException {
        Map json = super.serialize();
        if (getUsername() != null) 
			json.put(OpsGenieClientConstants.API.USERNAME, getUsername());
		if (getUserId() != null) 
			json.put(OpsGenieClientConstants.API.USER_ID, getUserId());
        if(getId() != null)
        	json.put(OpsGenieClientConstants.API.ID, getId());
        if(getApplyOrder() != null)
        	json.put(OpsGenieClientConstants.API.APPLY_ORDER, getApplyOrder());
        return json;
	}

	@Override
    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
	public ChangeNotificationRuleResponse createResponse() {
		return new ChangeNotificationRuleResponse();
	}
    /**
     * username of notificationRule to be deleted.
     */
	public String getUsername() {
		return username;
	}
    /**
     * Sets username of notificationRule to be deleted.
     */
	public void setUsername(String username) {
		this.username = username;
	}
    /**
     * userId of notificationRule to be deleted.
     */
	public String getUserId() {
		return userId;
	}
    /**
     * Sets userId of notificationRule to be deleted.
     */
	public void setUserId(String userId) {
		this.userId = userId;
	}
    /**
     * Id of notificationRule to be deleted.
     */
	public String getId() {
		return id;
	}
    /**
     * Sets Id of notificationRule to be deleted.
     */
	public void setId(String id) {
		this.id = id;
	}
	public Integer getApplyOrder() {
		return applyOrder;
	}
	public void setApplyOrder(Integer applyOrder) {
		this.applyOrder = applyOrder;
	}
	
	
	
	

}
