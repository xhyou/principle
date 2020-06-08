package com.builder.build.house;

import com.builder.build.domain.House;
import com.builder.build.service.HouseBuilder;

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
