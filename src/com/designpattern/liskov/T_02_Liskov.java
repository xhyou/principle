package com.designpattern.liskov;

//不合理的使用里氏替换原则
public class T_02_Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3="+a.func1(11,3)); //8

        System.out.println("--------");
        B b = new B();
        //使用组合
        System.out.println("11-3="+b.func3(11,3)); //11
    }
}

class Base{}

class A extends Base{
    public int func1(int num1,int num2){
        return num2-num1;
    }
}

class B extends Base{
    private A a  = new A();
    //重写了父类的方法
    public int func1(int a,int b){
        return a+b;
    }

    public int func2(int a,int b){
        return func1(a,b)+9;
    }

    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}
