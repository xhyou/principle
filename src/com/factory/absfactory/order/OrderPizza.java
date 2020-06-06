package com.factory.absfactory.order;

import com.factory.absfactory.service.AbstractFactory;
import com.factory.absfactory.service.PizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    private AbstractFactory factory;

    public OrderPizza(AbstractFactory factory){
        setFactory(factory);
    }

    public void setFactory(AbstractFactory abstractFactory){
        this.factory = abstractFactory;
        String orderType = getType();
        PizzaFactory pizza = factory.createPizzaFactory(orderType);
        if(pizza!=null){
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }else{
            System.out.println("创建失败");
        }

    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

}
