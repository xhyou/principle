//package com.single;
//
//
////单例模式之饿汉式
//public class T_03_Singleton {
//    public static void main(String[] args) {
//        Singleton newInstance = Singleton.getNewInstance();
//        Singleton newInstance1 = Singleton.getNewInstance();
//        System.out.println(newInstance==newInstance1);
//    }
//}
//
//class Singleton{
//
//    //私有化构造器
//    private Singleton(){
//    }
//
//    //3.静态内部类
//    private static class SingletonInstance{
//        private static final Singleton NEWINSTANCE = new Singleton();
//    }
//
//    public static  Singleton getNewInstance(){
//        return SingletonInstance.NEWINSTANCE;
//    }
//}
