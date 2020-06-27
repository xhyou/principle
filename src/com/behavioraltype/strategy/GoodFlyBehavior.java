package com.behavioraltype.strategy;

public class GoodFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我能飞翔得很好");
    }
}
