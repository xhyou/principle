package com.builder.build.service;

import com.builder.build.domain.House;

public abstract class HouseBuilder {

    public abstract void buildBasic();

    public abstract void buildWalls();

    public abstract void roofed();

    public abstract House buildHouse();
}
