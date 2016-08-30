package com.ifountain.opsgenie.client.model.group;

import com.ifountain.opsgenie.client.model.BaseRequest;
import com.ifountain.opsgenie.client.util.Strings;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Container for the parameters to make an add group api call.
 *
 * @see com.ifountain.opsgenie.client.IGroupOpsGenieClient#addGroupMember(AddGroupMemberRequest)
 */
public class AddGroupMemberRequest extends BaseRequest<AddGroupMemberResponse> {
    private String id;
    private String name;
    private List<String> users;


    /**
     * Rest api uri of addding group member operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/group/member";
    }

    /**
     * Id of group which members will be added
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id of group which members will be added
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Name of group which members will be added
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of group which members will be added
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Users to be added in String mode
     */
    @JsonProperty("users")
    public String getUsersString() {
        if (getUsers() != null)
            return Strings.join(getUsers(), ",");
        return null;
    }

    /**
     * Users to be added
     */
    public List<String> getUsers() {
        return users;
    }

    /**
     * Sets users to be added
     */
    public void setUsers(List<String> users) {
        this.users = users;
    }

    @Override
    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    public AddGroupMemberResponse createResponse() {
        return new AddGroupMemberResponse();
    }
}
