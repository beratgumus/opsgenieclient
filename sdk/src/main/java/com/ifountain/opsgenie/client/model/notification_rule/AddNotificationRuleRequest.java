package com.ifountain.opsgenie.client.model.notification_rule;

import com.ifountain.opsgenie.client.model.BaseUserRequest;
import com.ifountain.opsgenie.client.model.beans.Condition;
import com.ifountain.opsgenie.client.model.beans.NotificationRule.ActionType;
import com.ifountain.opsgenie.client.model.beans.NotificationRule.ConditionMatchType;
import com.ifountain.opsgenie.client.model.beans.NotificationRule.NotifyBefore;
import com.ifountain.opsgenie.client.model.beans.Restriction;

import java.util.List;

/**
 * Container for the parameters to make an add notificationRule api call.
 *
 * @author Mehmet Mustafa Demir
 * @see com.ifountain.opsgenie.client.INotificationRuleOpsGenieClient#addNotificationRule(AddNotificationRuleRequest)
 */
public class AddNotificationRuleRequest extends BaseUserRequest<AddNotificationRuleResponse, AddNotificationRuleRequest> {
    private String name;
    private ActionType actionType;
    private ConditionMatchType conditionMatchType;
    private List<Condition> conditions;
    private List<NotifyBefore> notifyBefore;
    private Integer applyOrder;
    private List<Restriction> restrictions;
    private List<String> schedules;

    /**
     * Rest api uri of adding notificationRule operation.
     */
    public String getEndPoint() {
        return "/v1.1/json/user/notificationRule";
    }

    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    @Override
    public AddNotificationRuleResponse createResponse() {
        return new AddNotificationRuleResponse();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionType getActionType() {
        return actionType;
    }

    public void setActionType(ActionType action) {
        this.actionType = action;
    }

    public ConditionMatchType getConditionMatchType() {
        return conditionMatchType;
    }

    public void setConditionMatchType(ConditionMatchType conditionType) {
        this.conditionMatchType = conditionType;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public List<Restriction> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
    }

    public List<String> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<String> schedules) {
        this.schedules = schedules;
    }

    public Integer getApplyOrder() {
        return applyOrder;
    }

    public void setApplyOrder(Integer applyOrder) {
        this.applyOrder = applyOrder;
    }

    public List<NotifyBefore> getNotifyBefore() {
        return notifyBefore;
    }

    public void setNotifyBefore(List<NotifyBefore> notifyBefore) {
        this.notifyBefore = notifyBefore;
    }

    public AddNotificationRuleRequest withName(String name) {
        this.name = name;
        return this;
    }

    public AddNotificationRuleRequest withActionType(ActionType actionType) {
        this.actionType = actionType;
        return this;
    }

    public AddNotificationRuleRequest withConditionMatchType(ConditionMatchType conditionMatchType) {
        this.conditionMatchType = conditionMatchType;
        return this;
    }

    public AddNotificationRuleRequest withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public AddNotificationRuleRequest withNotifyBefore(List<NotifyBefore> notifyBefore) {
        this.notifyBefore = notifyBefore;
        return this;
    }

    public AddNotificationRuleRequest withApplyOrder(Integer applyOrder) {
        this.applyOrder = applyOrder;
        return this;
    }

    public AddNotificationRuleRequest withRestrictions(List<Restriction> restrictions) {
        this.restrictions = restrictions;
        return this;
    }

    public AddNotificationRuleRequest withSchedules(List<String> schedules) {
        this.schedules = schedules;
        return this;
    }

}
