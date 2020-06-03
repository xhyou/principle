package com.uml.composite;


public class Person {
   //聚合关系
   private IDCard idCard;
   //组合关系,当person销毁heady也一起销毁
   private Head head = new Head();

}
