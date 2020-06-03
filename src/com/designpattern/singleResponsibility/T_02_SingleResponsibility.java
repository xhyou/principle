package com.designpattern.singleResponsibility;

public class T_02_SingleResponsibility {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

//遵守了单一原则,但是类的花销很大
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println("在公路上跑");
    }
}

class AirVehicle{
    public void run(String vehicle) {
        System.out.println("在天上跑");
    }
}