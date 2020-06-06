package com.factory.factorymethod.orderfactory;

import com.factory.factorymethod.pizza.FZApplePizza;
import com.factory.factorymethod.pizza.FZChessPizza;
import com.factory.factorymethod.service.PizzaFactory;

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
