package com.factory.absfactory.service;

public interface AbstractFactory {
    PizzaFactory createPizzaFactory(String typePizza);
}
