package com.structural.decorator;

public class Chocalate extends Director {

    public Chocalate(Drink drink){
        super(drink);
        setDesc("巧克力");
        setPrice(3.0f);
    }

}

