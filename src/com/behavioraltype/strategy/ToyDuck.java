package com.behavioraltype.strategy;

public class ToyDuck  extends Strategy {

    public ToyDuck(){
        flyBehavior = new NoFlyBehavior();
    }

    @Override
    void display() {
        System.out.println("我是玩具鸭");
    }
}
