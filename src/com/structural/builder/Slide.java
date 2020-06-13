package com.structural.builder;

public class Slide extends Phone {

    public Slide(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("滑盖式得手机");
    }
}
