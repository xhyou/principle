package com.factory.simplefactory.pizza;

import com.factory.simplefactory.service.PizzaFactory;

public class ApplePizza extends PizzaFactory {

    @Override
    public void prepare() {
        System.out.println("苹果pizza开始准备");
    }
}
