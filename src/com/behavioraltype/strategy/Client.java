package com.behavioraltype.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy  toyDuck = new ToyDuck();
        toyDuck.fly();

        Strategy pekingDuck = new PekingDuck();
        pekingDuck.fly();

        Strategy wildDuck = new WildDuck();
        wildDuck.fly();
    }

}
