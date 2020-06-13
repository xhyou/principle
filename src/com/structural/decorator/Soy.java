package com.structural.decorator;

public class Soy extends Director {

    public Soy(Drink drink) {
        super(drink);
        setDesc("豆浆");
        setPrice(1.5f);
    }
}
