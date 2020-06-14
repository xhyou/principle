package com.structural.proxy.cglib;

import com.structural.proxy.staticproxy.ITeachDao;

public class TeachDao implements ITeachDao {

    @Override
    public void teach() {
        System.out.println("老师正在授课....");
    }
}
