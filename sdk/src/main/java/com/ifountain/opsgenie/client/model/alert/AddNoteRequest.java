package com.ifountain.opsgenie.client.model.alert;

/**
 * Container for the parameters to make an add note api call.
 *
 * @author Sezgin Kucukkaraaslan
 * @see com.ifountain.opsgenie.client.IAlertOpsGenieClient#addNote(AddNoteRequest)
 * @deprecated As of release 2.8.0, replaced by {@link com.ifountain.opsgenie.client.swagger.model.AddAlertNoteRequest}
 */
@Deprecated
public class AddNoteRequest extends BaseAlertRequestWithParameters<AddNoteResponse, AddNoteRequest> {

    /**
     * Rest api uri of add note operation.
     */
    @Override
    public String getEndPoint() {
        return "/v1/json/alert/note";
    }

    /**
     * @see com.ifountain.opsgenie.client.model.BaseRequest#createResponse()
     */
    @Override
    public AddNoteResponse createResponse() {
        return new AddNoteResponse();
    }
}
