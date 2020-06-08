package com.creationtype.factory.absfactory.service;

public abstract class PizzaFactory {
    //定义pizza的名字
    private String name;

    public abstract void prepare();

    public void bake(){
        System.out.println(name+"开始制作");
    }

    public void cut(){
        System.out.println(name+"开始切割");
    }

    public void box(){
        System.out.println(name+"打包");
    }

    public void setName(String name) {
        this.name = name;
    }
}
