package com.builder.build.direct;

import com.builder.build.domain.House;
import com.builder.build.service.HouseBuilder;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public House buildHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
       return houseBuilder.buildHouse();
    }

}
