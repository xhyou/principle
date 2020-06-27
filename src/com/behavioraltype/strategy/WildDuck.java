package com.behavioraltype.strategy;

public class WildDuck extends Strategy {

    public WildDuck(){
        this.flyBehavior = new GoodFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("我是野鸭子");
    }
}
