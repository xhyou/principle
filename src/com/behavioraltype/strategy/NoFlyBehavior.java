package com.behavioraltype.strategy;

public class NoFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我能飞翔一点点");
    }
}
