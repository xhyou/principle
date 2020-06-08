package com.creationtype.factory.absfactory.service;

public interface AbstractFactory {
    PizzaFactory createPizzaFactory(String typePizza);
}
