package com.ifountain.client.model;

/**
 * Interface for OpsGenie service api requests.
 *
 * @author Sezgin Kucukkaraaslan
 * @version 5/30/12 9:40 AM
 * @see com.ifountain.client.opsgenie.IOpsGenieClient
 * @see com.ifountain.client.opsgenie.OpsGenieClient
 */
public interface Request {
    /**
     * Returns the request's rest api uri.
     */
    public String getEndPoint();
}