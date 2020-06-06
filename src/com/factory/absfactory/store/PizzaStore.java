package com.factory.absfactory.store;

import com.factory.absfactory.factory.XMFactory;
import com.factory.absfactory.order.OrderPizza;

public class PizzaStore {
    public static void main(String[] args) {
        OrderPizza orderPizza = new OrderPizza(new XMFactory());
    }
}
