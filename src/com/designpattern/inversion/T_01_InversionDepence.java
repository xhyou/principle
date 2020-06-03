/*
package com.designpattern.inversion;

*/
/**
 * 依赖倒置原则
 *//*

public class T_01_InversionDepence {
    public static void main(String[] args) {
        Person person = new Person();
        //不符合依赖倒置原则
        person.receive(new Email());
    }

}

class Email{
    public String getInfo(){
        return "电子邮件信息:hello,world";
    }
}

*/
/**
 * 不符合依赖倒置
 *  原因:当我们接收的参数不是邮件,而是短信微信呢？此时就不通用了
 *  解决方法:引入一个接口IReceive,表示接收者，这样Person类与接口IReceive发生依赖
 *//*

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
*/
