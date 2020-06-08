package com.creationtype.builder.build.direct;

import com.creationtype.builder.build.domain.House;
import com.creationtype.builder.build.service.HouseBuilder;

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
