package com.company;

import com.company.messages.PlainTextMessage;
import com.company.messages.TopSecretMessage;

public class Connection<T>{
    private String connectionName;

    void readMessages(Channel<? extends T > channel){
        System.out.println("----------------------");
        while(!channel.isEmpty()){
            channel.received();
        }
    }

    void sendMessages(Channel<? super T> channel){
        channel.sendCasualMess("Sending casual mess");
    }



}
