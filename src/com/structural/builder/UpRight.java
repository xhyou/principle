package com.structural.builder;

public class UpRight extends Phone {

    public UpRight(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("直立式的手机");
    }
}
