package com.creationtype.factory.simplefactory.store;

import com.creationtype.factory.simplefactory.order.OrderPizza;
import com.creationtype.factory.simplefactory.orderfactory.OrderFactory;

public class PizzaStore {
    public static void main(String[] args) {
        //没有使用工厂模式
        OrderPizza orderPizza = new OrderPizza();
        orderPizza.createPizza();
        //使用工厂模式
        orderPizza.createPizzaByFactory(new OrderFactory());
        //使用静态工厂
        orderPizza.createPizzaByStaticFactory();
    }
}
