/*
package com.designpattern.segregation;

public class T_01_Segragation {
    //此方法没有实现接口的最小依赖
    public static void main(String[] args) {
        A a = new A();
        a.Operation1(new B());
        a.Operation2(new B());
        a.Operation3(new B());

        C c = new C();
        c.Operation1(new D());
        c.Operation4(new D());
        c.Operation5(new D());
    }
}

//A通过依赖B实现1，2，3接口
class A{
    public void Operation1(Interface1 i){
         i.Operation1();
    }
    public void Operation2(Interface1 i){
        i.Operation2();
    }
    public void Operation3(Interface1 i){
        i.Operation3();
    }
}

//C通过依赖D实现 1，3，5接口
class C{
    public void Operation1(Interface1 i){
        i.Operation1();
    }
    public void Operation4(Interface1 i){
        i.Operation4();
    }
    public void Operation5(Interface1 i){
        i.Operation5();
    }
}

interface  Interface1 {
    void Operation1();
    void Operation2();
    void Operation3();
    void Operation4();
    void Operation5();
}

class B implements Interface1{

    @Override
    public void Operation1() {
        System.out.println("B实现了Operation1");
    }

    @Override
    public void Operation2() {
        System.out.println("B实现了Operation2");
    }

    @Override
    public void Operation3() {
        System.out.println("B实现了Operation3");
    }

    @Override
    public void Operation4() {
        System.out.println("B实现了Operation4");
    }

    @Override
    public void Operation5() {
        System.out.println("B实现了Operation5");
    }
}

class D implements  Interface1{

    @Override
    public void Operation1() {
        System.out.println("D实现了Operation1");
    }

    @Override
    public void Operation2() {
        System.out.println("D实现了Operation2");
    }

    @Override
    public void Operation3() {
        System.out.println("D实现了Operation3");
    }

    @Override
    public void Operation4() {
        System.out.println("D实现了Operation4");
    }

    @Override
    public void Operation5() {
        System.out.println("D实现了Operation5");
    }
}*/
