package com.behavioraltype.strategy;

public class PekingDuck extends Strategy {

    public PekingDuck(){
        flyBehavior = new BadFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("我是北京烤鸭");
    }
}
