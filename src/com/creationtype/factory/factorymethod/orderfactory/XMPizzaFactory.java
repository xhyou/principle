package com.creationtype.factory.factorymethod.orderfactory;

import com.creationtype.factory.factorymethod.pizza.XMApplePizza;
import com.creationtype.factory.factorymethod.pizza.XMChessPizza;
import com.creationtype.factory.factorymethod.service.PizzaFactory;

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
