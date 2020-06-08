package com.creationtype.factory.absfactory.factory;

import com.creationtype.factory.absfactory.pizza.FZApplePizza;
import com.creationtype.factory.absfactory.pizza.FZChessPizza;
import com.creationtype.factory.absfactory.service.AbstractFactory;
import com.creationtype.factory.absfactory.service.PizzaFactory;

public class FZFactory implements AbstractFactory {

    @Override
    public PizzaFactory createPizzaFactory(String typePizza) {
        PizzaFactory factory = null;
        if("apple".equals(typePizza)){
            factory = new FZApplePizza();
        }else if("chess".equals(typePizza)){
            factory = new FZChessPizza();
        }else{
            System.out.println("暂无该类别");
        }
        return factory;
    }
}
