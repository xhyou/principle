package com.structural.decorator;

public class Director extends Drink {

    private Drink drink;

    public Director(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc()+drink.getDesc();
    }
}
