package com.creationtype.factory.factorymethod.store;

import com.creationtype.factory.factorymethod.orderfactory.XMPizzaFactory;
import com.creationtype.factory.factorymethod.service.PizzaFactory;

public class PizzaStore {
    public static void main(String[] args) {
        XMPizzaFactory xmPizzaFactory = new XMPizzaFactory();
        PizzaFactory pizza = xmPizzaFactory.createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
