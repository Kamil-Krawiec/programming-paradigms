package com.company;

import com.company.messages.EncryptedMessage;
import com.company.messages.PlainTextMessage;
import com.company.messages.TopSecretMessage;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //every type of message
        Channel<TopSecretMessage> topSecretMessageChannel = new Channel<>(new LinkedList<>());
        //enctypted and plain
        Channel<EncryptedMessage> encryptedMessageChannel = new Channel<>(new LinkedList<>());
        //plain
        Channel<PlainTextMessage> plainTextMessageChannel = new Channel<>(new LinkedList<>());

        topSecretMessageChannel.send(new TopSecretMessage("Kolejka Top dziala"));
        topSecretMessageChannel.send(new TopSecretMessage("Druga wiadomosc kanal top Secret"));
        topSecretMessageChannel.send(new EncryptedMessage("Wiadomosc encrypted w top secret"));
        topSecretMessageChannel.send(new PlainTextMessage("Wiadomosc plain w top secret"));

        encryptedMessageChannel.send(new EncryptedMessage("Kolejka En dziala"));
        encryptedMessageChannel.send(new EncryptedMessage("Drugfa wiadomosc enctypted"));
        encryptedMessageChannel.send(new PlainTextMessage("Wiadomosc plain w encrypted"));


        plainTextMessageChannel.send(new PlainTextMessage("Kolejka plain dziala"));
        plainTextMessageChannel.send(new PlainTextMessage("Druga wiadomosc plain"));

        Connection< EncryptedMessage > encryptedMessageConnection = new Connection<>();

        encryptedMessageConnection.readMessages(encryptedMessageChannel);
        encryptedMessageConnection.readMessages(plainTextMessageChannel);
//        encryptedMessageConnection.readMessages(TopSecretMessage); NIE DZIALA

        encryptedMessageConnection.sendMessages(encryptedMessageChannel);
        encryptedMessageConnection.sendMessages(topSecretMessageChannel);
//        encryptedMessageConnection.sendMessages(plainTextMessageChannel); NIE DZIALA



    }



}
