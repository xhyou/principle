package com.factory.factorymethod.pizza;

import com.factory.factorymethod.service.PizzaFactory;

public class FZChessPizza extends PizzaFactory {
    @Override
    public void prepare() {
        setName("福州味的奶酪披萨");
        System.out.println("福州的奶酪披萨开始准备");
    }
}
