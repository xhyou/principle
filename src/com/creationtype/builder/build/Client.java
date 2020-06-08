package com.creationtype.builder.build;

import com.creationtype.builder.build.direct.HouseDirector;
import com.creationtype.builder.build.house.CommonHouseBuilder;
import com.creationtype.builder.build.service.HouseBuilder;

public class Client {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new CommonHouseBuilder();
        HouseDirector houseDirector = new HouseDirector(houseBuilder);
        houseDirector.buildHouse();
    }
}
