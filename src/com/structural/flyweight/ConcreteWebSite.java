package com.structural.flyweight;

public class ConcreteWebSite extends WebSite {

    //共享的内部状态
    private String type;

    public ConcreteWebSite(String type){
        this.type = type;
    }

    @Override
    void use(User user) {
        System.out.println("网站的发布形式为:" + type + " 在使用中 .. 使用者是" + user.getName());
    }
}
