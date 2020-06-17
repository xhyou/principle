package com.behavioraltype.template;

public class PeanutSoyaMilk extends SoyaMilk {

    @Override
    public void addCondiments() {
        System.out.println("加入花生,制作花生豆浆");
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
