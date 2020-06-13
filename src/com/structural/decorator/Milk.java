package com.structural.decorator;

public class Milk extends Director {

    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(3.0f);
    }
}
