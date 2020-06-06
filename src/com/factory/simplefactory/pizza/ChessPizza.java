package com.factory.simplefactory.pizza;

import com.factory.simplefactory.service.PizzaFactory;

//让奶酪pizza继承
public class ChessPizza extends PizzaFactory {

    @Override
    public void prepare() {
        System.out.println("奶酪pizza开始准备");
    }
}
