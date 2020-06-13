package com.structural.builder;

public class Folded extends Phone {

    public Folded(Brand brand) {
        super(brand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("折叠式的手机");
    }
}
