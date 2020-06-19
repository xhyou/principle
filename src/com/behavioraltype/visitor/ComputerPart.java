package com.behavioraltype.visitor;

public abstract class ComputerPart {
    abstract void accept(Visitor v);

    abstract double getPrice();
}
