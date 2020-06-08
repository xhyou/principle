package com.builder.build;

import com.builder.build.direct.HouseDirector;
import com.builder.build.house.CommonHouseBuilder;
import com.builder.build.service.HouseBuilder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        houseDirector.buildHouse();
    }
}
