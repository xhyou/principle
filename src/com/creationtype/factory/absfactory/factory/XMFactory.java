package com.creationtype.factory.absfactory.factory;

import com.creationtype.factory.absfactory.pizza.XMApplePizza;
import com.creationtype.factory.absfactory.pizza.XMChessPizza;
import com.creationtype.factory.absfactory.service.AbstractFactory;
import com.creationtype.factory.absfactory.service.PizzaFactory;

public class XMFactory implements AbstractFactory {

    @Override
    public PizzaFactory createPizzaFactory(String typePizza) {
        PizzaFactory factory = null;
        if("apple".equals(typePizza)){
            factory = new XMApplePizza();
        }else if("chess".equals(typePizza)){
            factory = new XMChessPizza();
        }else{
            System.out.println("暂无该类别");
        }
        return factory;
    }
}
