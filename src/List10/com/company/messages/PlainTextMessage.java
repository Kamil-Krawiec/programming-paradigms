package com.company.messages;

import com.company.messages.EncryptedMessage;

public class PlainTextMessage extends EncryptedMessage {

    public PlainTextMessage(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "PlainTextMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
