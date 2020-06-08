package com.creationtype.builder.build.house;

import com.creationtype.builder.build.domain.House;
import com.creationtype.builder.build.service.HouseBuilder;

public class CommonHouseBuilder extends HouseBuilder {

    private House house;

    public CommonHouseBuilder(){
        house = new House();
    }

    @Override
    public void buildBasic() {
        System.out.println("commonHouse buildBasic");
    }

    @Override
    public void buildWalls() {
        System.out.println("commonHouse buildWalls");
    }

    @Override
    public void roofed() {
        System.out.println("commonHouse roofed");
    }

    @Override
    public House buildHouse() {
        return house;
    }
}
