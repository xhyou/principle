package com.creationtype.builder.normal.service;

public abstract class AbstractHouse {

    protected abstract void buildBasic();

    protected abstract void buildWalls();

    protected abstract void roofed();

    /**
     * 创建房子
     */
    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}
