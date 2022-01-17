package com.company;

import com.company.messages.PlainTextMessage;

import java.util.Queue;

public class Channel<T> {

    private Queue<T> messQueue;

    public Channel(Queue<T> messQueue) {
        this.messQueue = messQueue;
    }

    void send(T messToSend) {
        messQueue.add(messToSend);
        System.out.println("Sending: " + messToSend.toString());
    }

    void sendCasualMess(String text){
        send((T) new PlainTextMessage(text));
    }

    void received() {
        if (!messQueue.isEmpty()) System.out.println("Recived: " + messQueue.poll());
        else System.out.println("You have no messages.");
    }

    public boolean isEmpty() {
        return messQueue.isEmpty();
    }

}
