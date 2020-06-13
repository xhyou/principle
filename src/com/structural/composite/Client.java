package com.structural.composite;

public class Client {

    public static void main(String[] args) {
        OrganizationComponent university = new University("清华大学","梦想的校园");

        OrganizationComponent softCollege = new College("软件学院","Java开发");
        OrganizationComponent infoCollege = new College("信息学院","以太网的研究");

        softCollege.add(new Department("软件工程","软件工程"));
        softCollege.add(new Department("通信工程","通信工程"));

        infoCollege.add(new Department("信息工程","信息工程"));

        university.add(softCollege);
        university.add(infoCollege);

        university.print();

    }
}
