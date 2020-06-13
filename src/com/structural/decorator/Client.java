package com.structural.decorator;

public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();
        order = new Milk(order);
        System.out.println("longBlack加入一份牛奶,总的价格是:"+order.cost());
        System.out.println("加入一份牛奶描述为:"+order.getDesc());
        //在加一份牛奶
        order = new Milk(order);
        System.out.println("longBlack加入2份牛奶,总的价格是:"+order.cost());
        System.out.println("加入2份牛奶描述为:"+order.getDesc());
    }
}
