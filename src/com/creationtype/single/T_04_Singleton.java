package com.creationtype.single;


//枚举的方式
public class T_04_Singleton {
    public static void main(String[] args) {
        Singleton newInstance = Singleton.getNewInstance();
        Singleton newInstance1 = Singleton.getNewInstance();
        System.out.println(newInstance==newInstance1);
    }
}

class Singleton{

    private Singleton(){
    }

    static enum SingletonEnum{
        INSTANCE;
        private Singleton singleton;
        public Singleton getInstance(){
            return  new Singleton();
        }

    }

    public static  Singleton getNewInstance(){
        return SingletonEnum.INSTANCE.getInstance();
    }
}
