package com.behavioraltype.mediator;

public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,name);
    }

    public void sendAlarm(int stateChange){
        sendMessage(stateChange);
    }
}
