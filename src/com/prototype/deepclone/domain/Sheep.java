package com.prototype.deepclone.domain;

import java.io.Serializable;

public class Sheep implements Cloneable, Serializable {

    private String name;

    public Sheep(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
    }

    //第二种不需要这个
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
