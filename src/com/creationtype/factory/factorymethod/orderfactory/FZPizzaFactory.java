package com.creationtype.factory.factorymethod.orderfactory;

import com.creationtype.factory.factorymethod.pizza.FZApplePizza;
import com.creationtype.factory.factorymethod.pizza.FZChessPizza;
import com.creationtype.factory.factorymethod.service.PizzaFactory;

public class FZPizzaFactory extends MethodFactory{

    @Override
    public PizzaFactory createPizza() {
        PizzaFactory factory = null;
        String typePizza =getType();
        if(typePizza.equals("apple")){
            factory = new FZApplePizza();
        }else if(typePizza.equals("chess")){
            factory= new FZChessPizza();
        }
        return factory;
    }
}
