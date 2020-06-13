package com.structural.composite;

import java.io.ObjectInputStream;

public abstract class OrganizationComponent {
    //学院的名字
    private String name;
    //学院的描述
    private String desc;

    public OrganizationComponent(String name,String desc){
        this.desc =desc;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public abstract void print();

    @Override
    public String toString() {
        return "OrganizationComponent{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
