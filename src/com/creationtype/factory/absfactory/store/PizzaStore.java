package com.creationtype.factory.absfactory.store;

import com.creationtype.factory.absfactory.factory.XMFactory;
import com.creationtype.factory.absfactory.order.OrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new XMFactory());
    }
}
