package com.structural.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        TeachDao teachDao = new TeachDao();
        TeachDao proxyInstance = (TeachDao) new TeacherDaoProxy(teachDao).getProxyInstance();
        proxyInstance.teach();
    }
}
