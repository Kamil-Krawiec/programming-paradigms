package com.company.messages;

public class TopSecretMessage {
    protected String message;

    public TopSecretMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "TopSecretMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}
