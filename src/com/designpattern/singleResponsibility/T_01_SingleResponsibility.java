package com.designpattern.singleResponsibility;

public class T_01_SingleResponsibility {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}

//违反了单一原则,因为它即管天上飞了 又管地下跑的
//解决方法:根据不同的交通工具的运行方法 分解为不同的类即可
class Vehicle{
    public void run(String vehicle){
        System.out.println("在公路上跑");
    }
}