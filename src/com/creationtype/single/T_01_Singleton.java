package com.creationtype.single;


//单例模式之饿汉式
/*public class T_01_Singleton {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getNewInstance();
        Singleton newInstance1 = Singleton.getNewInstance();
        System.out.println(newInstance==newInstance1);
    }
}
class Singleton{

    //私有化构造器
    private Singleton(){

    }
    //2.本地内部类创建实例
    private final static Singleton newInstance =new Singleton();

    //3.提供一个共有的方法
    public static  Singleton getNewInstance(){
        return newInstance;
    }
}*/
