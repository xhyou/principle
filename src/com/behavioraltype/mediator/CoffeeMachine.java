package com.behavioraltype.mediator;

public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.name);
    }

    public void startCoffee() {
        System.out.println("It's time to startcoffee!");
    }

    public void FinishCoffee() {

        System.out.println("After 5 minutes!");
        System.out.println("Coffee is ok!");
        sendMessage(0);
    }
}
