//package com.single;
//
//
////单例模式之饿汉式
//public class T_02_Singleton {
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
//    //2.本地内部类创建实例
//    private  static volatile   Singleton newInstance;
//
//    public static  Singleton getNewInstance(){
//        if(newInstance==null){
//            synchronized (Singleton.class){
//                if(newInstance==null){
//                    newInstance = new Singleton();
//                }
//            }
//        }
//        return newInstance;
//    }
//}
