/*
package com.designpattern.liskov;

//不合理的使用里氏替换原则
public class T_01_Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3)); //8

        System.out.println("--------");
        B b = new B();
        //重写了父类的方法,当在调用的时候以为是使用继承的A类的减法
        System.out.println("11-3="+b.func1(11,3)); //14
    }
}

class A{
    public int func1(int num1,int num2){
        return num2-num1;
    }
}

class B extends A{
    //重写了父类的方法
    public int func1(int a,int b){
        return a+b;
    }

    public int func2(int a,int b){
        return func1(a,b)+9;
    }
}
*/
