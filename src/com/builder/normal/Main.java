package com.builder.normal;

import com.builder.normal.house.NormalHouse;
import com.builder.normal.service.AbstractHouse;

public class Main {
    public static void main(String[] args) {
         AbstractHouse house = new NormalHouse();
         house.build();
    }
}
