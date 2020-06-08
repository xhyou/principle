package com.creationtype.factory.simplefactory.order;

import com.creationtype.factory.simplefactory.orderfactory.OrderFactory;
import com.creationtype.factory.simplefactory.pizza.ApplePizza;
import com.creationtype.factory.simplefactory.pizza.ChessPizza;
import com.creationtype.factory.simplefactory.service.PizzaFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//订购pizza的商店
public class OrderPizza {

    //1.没有使用简单工厂之前的做法
    //做法存在的弊端:违反了开闭原则 每次我新增一个pizza我都需要添加一个if else
    public void createPizza(){
        PizzaFactory pizzaFactory = null;
        String pizzaType = getType();
        //如果是奶酪
        if(pizzaType.equals("chess")){
            pizzaFactory = new ChessPizza();
            pizzaFactory.setName("chess");
        }else if(pizzaType.equals("apple")){
            pizzaFactory = new ApplePizza();
            pizzaFactory.setName("apple");
        }else{
            System.out.println("暂无该类型的pizza");
        }

        pizzaFactory.prepare();
        pizzaFactory.bake();
        pizzaFactory.cut();
        pizzaFactory.box();
    }

    //2.使用工厂模式优化之后的代码
    public  void createPizzaByFactory(OrderFactory orderFactory){
        String pizzaType = getType();
        PizzaFactory pizzaFactory = orderFactory.createPizza(pizzaType);
        pizzaFactory.prepare();
        pizzaFactory.bake();
        pizzaFactory.cut();
        pizzaFactory.box();
    }

    //2.使用静态工厂模式优化之后的代码
    public  void createPizzaByStaticFactory(){
        String pizzaType = getType();
        PizzaFactory pizzaFactory = OrderFactory.createPizzaByStatic(pizzaType);
        pizzaFactory.prepare();
        pizzaFactory.bake();
        pizzaFactory.cut();
        pizzaFactory.box();
    }

    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizzaType:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
