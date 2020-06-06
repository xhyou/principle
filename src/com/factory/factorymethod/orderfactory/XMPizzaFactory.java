package com.factory.factorymethod.orderfactory;

import com.factory.factorymethod.pizza.XMApplePizza;
import com.factory.factorymethod.pizza.XMChessPizza;
import com.factory.factorymethod.service.PizzaFactory;

public class XMPizzaFactory extends MethodFactory {

    @Override
    public PizzaFactory createPizza() {
        PizzaFactory factory = null;
        String typePizza =getType();
        if(typePizza.equals("apple")){
            factory = new XMApplePizza();
        }else if(typePizza.equals("chess")){
            factory= new XMChessPizza();
        }
        return factory;
    }
}
