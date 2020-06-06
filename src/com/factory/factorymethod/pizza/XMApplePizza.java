package com.factory.factorymethod.pizza;

import com.factory.factorymethod.service.PizzaFactory;

//订购不同风味的Pizza
public class XMApplePizza  extends PizzaFactory {
    @Override
    public void prepare() {
        setName("厦门味的苹果披萨");
        System.out.println("厦门味的苹果披萨开始准备");
    }
}
