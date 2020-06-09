package com.structural.adapter.interfaceadapter;

public class Client {
    public static void main(String[] args) {

        AbstractAdapter abstractAdapter =new AbstractAdapter(){
            @Override
            public void method1() {
                System.out.println("我只实现接口一");
            }
        };
        abstractAdapter.method1();
    }
}
