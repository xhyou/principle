package com.creationtype.factory.simplefactory.orderfactory;

import com.creationtype.factory.simplefactory.pizza.ApplePizza;
import com.creationtype.factory.simplefactory.pizza.ChessPizza;
import com.creationtype.factory.simplefactory.service.PizzaFactory;

public class OrderFactory {
    //传入一个pizza的类型
    public PizzaFactory createPizza(String pizzaType){
        PizzaFactory pizzaFactory = null;
        if(pizzaType.equals("apple")){
            pizzaFactory = new ApplePizza();
            pizzaFactory.setName("apple");
        }else if(pizzaType.equals("chess")){
            pizzaFactory = new ChessPizza();
            pizzaFactory.setName("chess");
        }
        return pizzaFactory;
    }

    //使用静态工厂来做
    public static PizzaFactory createPizzaByStatic(String pizzaType){
        PizzaFactory pizzaFactory = null;
        if(pizzaType.equals("apple")){
            pizzaFactory = new ApplePizza();
            pizzaFactory.setName("apple");
        }else if(pizzaType.equals("chess")){
            pizzaFactory = new ChessPizza();
            pizzaFactory.setName("chess");
        }
        return pizzaFactory;
    }
}
