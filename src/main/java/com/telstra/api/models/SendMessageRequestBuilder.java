/*
 * TelstraSMSAUSLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ) on 09/30/2016
 */
package com.telstra.api.models;

import java.util.*;

public class SendMessageRequestBuilder {
    //the instance to build
    private SendMessageRequest sendMessageRequest;

    /**
     * Default constructor to initialize the instance
     */
    public SendMessageRequestBuilder() {
        sendMessageRequest = new SendMessageRequest();
    }

    public SendMessageRequestBuilder body(String body) {
        sendMessageRequest.setBody(body);
        return this;
    }

    public SendMessageRequestBuilder to(String to) {
        sendMessageRequest.setTo(to);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public SendMessageRequest build() {
        return sendMessageRequest;
    }
}