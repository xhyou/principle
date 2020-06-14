package com.structural.flyweight;

public class Client {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();
        WebSite webSite1 = factory.getWebSite("新闻");
        webSite1.use(new User("tom"));

        WebSite webSite2 = factory.getWebSite("新闻");
        webSite2.use(new User("jack"));

        System.out.println("当前网站的数量为:"+factory.getWebSiteCount());

    }
}
