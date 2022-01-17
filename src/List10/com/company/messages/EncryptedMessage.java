package com.company.messages;

public class EncryptedMessage extends TopSecretMessage {

    public EncryptedMessage(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "EncryptedMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
