package com.creationtype.factory.factorymethod.orderfactory;

import com.creationtype.factory.factorymethod.service.PizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public  abstract class MethodFactory {
    abstract  PizzaFactory createPizza();

    public String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizzaType:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
