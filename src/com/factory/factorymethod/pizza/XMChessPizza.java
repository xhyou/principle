package com.factory.factorymethod.pizza;

import com.factory.factorymethod.service.PizzaFactory;

public class XMChessPizza extends PizzaFactory {

    @Override
    public void prepare() {
        setName("厦门味的奶酪披萨");
        System.out.println("厦门的奶酪披萨开始准备");
    }
}
