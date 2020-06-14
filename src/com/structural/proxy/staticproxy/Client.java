package com.structural.proxy.staticproxy;

public class Client  {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeachDao());
        teacherDaoProxy.teach();
    }
}
