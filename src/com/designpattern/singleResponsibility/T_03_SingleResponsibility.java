package com.designpattern.singleResponsibility;

public class T_03_SingleResponsibility {
    public static void main(String[] args) {
        CommonVehicle commonVehicle = new CommonVehicle();
        commonVehicle.roadRun("汽车");
        commonVehicle.airRun("飞机");
    }
}

//遵守了单一原则,在类上没有遵守单一职责,但是在方法的级别上遵守了单一职责
class CommonVehicle {
    public void roadRun(String vehicle) {
        System.out.println("在公路上跑");
    }

    public void airRun(String vehicle) {
        System.out.println("在天上跑");
    }
}
