package com.ifountain.opsgenie.client.model.contact;

import com.ifountain.opsgenie.client.model.BaseRequest;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * TODO: validation
 * <p>
 * Container for the parameters to make an update contact api call.
 *
 * @see com.ifountain.opsgenie.client.IContactOpsGenieClient#updateContact(UpdateContactRequest)
 */
public class UpdateContactRequest extends BaseRequest<UpdateContactResponse> {
    @JsonSerialize(include = Inclusion.ALWAYS)
    private String id;
    private String username;
    private String userId;
    private String to;

    /**
     * Rest api uri of updating contact operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/user/contact";
    }

    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    @Override
    public UpdateContactResponse createResponse() {
        return new UpdateContactResponse();
    }

    /**
     * Id of contact to be updated
     */
    public String getId() {
        return id;
    }

    /**
     * Sets Id of contact to be updated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * UserName of contact to be updated
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets UserName of contact to be updated
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * userId of contact to be updated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets userId of contact to be updated
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * to of contact to be updated
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets to of contact to be updated
     */
    public void setTo(String to) {
        this.to = to;
    }


}
