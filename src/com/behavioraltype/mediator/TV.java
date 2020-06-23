package com.behavioraltype.mediator;

public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
      this.getMediator().getMessage(stateChange,name);
    }

    public void startTv() {
        // TODO Auto-generated method stub
        System.out.println("It's time to StartTv!");
    }

    public void stopTv() {
        // TODO Auto-generated method stub
        System.out.println("StopTv!");
    }
}
