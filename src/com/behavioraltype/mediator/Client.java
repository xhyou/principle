package com.behavioraltype.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        //创建一个Alarm
        Alarm alarm = new Alarm(mediator,"Alarm");
        //创建一个CofferMachine
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "CoffeeMachine");
        //创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
        Curtains curtains = new Curtains(mediator, "curtains");
        TV tV = new TV(mediator, "TV");

        //让闹钟发出消息
        alarm.sendAlarm(0);
        coffeeMachine.FinishCoffee();
        alarm.sendAlarm(1);
    }
}
