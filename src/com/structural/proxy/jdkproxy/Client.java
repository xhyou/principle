package com.structural.proxy.jdkproxy;

import com.structural.proxy.staticproxy.ITeachDao;
import com.structural.proxy.staticproxy.TeachDao;

public class Client {
    public static void main(String[] args) {
        ITeachDao teachDao = new TeachDao();
        TeacherDaoProxy proxy = new TeacherDaoProxy(teachDao);
        ITeachDao proxyInstance = (ITeachDao) proxy.getProxyInstance();
        System.out.println("proxyInstance=" + proxyInstance.getClass());
        proxyInstance.teach();
    }
}
