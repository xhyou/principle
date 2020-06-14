package com.structural.proxy.staticproxy;

public class TeachDao implements ITeachDao {

    @Override
    public void teach() {
        System.out.println("老师正在授课....");
    }
}
