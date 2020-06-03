package com.designpattern.inversion;

/**
 * 依赖倒置原则
 */
public class T_02_InversionDepence {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Weixin());
    }

}

interface IReceive{
    String getInfo();
}

class Email implements  IReceive{
    public String getInfo(){
        return "电子邮件信息:hello,world";
    }
}

class Weixin implements IReceive{

    @Override
    public String getInfo() {
        return "微信信息:hello,wechat";
    }
}

class Person{
    public void receive(IReceive receive){
        System.out.println(receive.getInfo());
    }
}
