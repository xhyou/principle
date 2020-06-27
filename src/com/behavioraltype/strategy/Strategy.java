package com.behavioraltype.strategy;

public abstract class Strategy {

    FlyBehavior flyBehavior;

    abstract void display();

    public void quack(){
        System.out.println("鸭子嘎嘎叫");
    }

    public void swim(){
        System.out.println("鸭子学会游泳");
    }

    public void fly(){
        if(flyBehavior!=null){
            flyBehavior.fly();
        }
    }
}
