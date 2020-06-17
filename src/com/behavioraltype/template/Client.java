package com.behavioraltype.template;

public class Client {
    public static void main(String[] args) {
        SoyaMilk peanutSoyaMilk =new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("=========================");

        SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
        redBeanSoyaMilk.make();
    }
}
