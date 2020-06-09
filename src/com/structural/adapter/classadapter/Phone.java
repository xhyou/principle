package com.structural.adapter.classadapter;

public class Phone {

   void charging(IVoltage5V iVoltage5V){
       int targetElestic = iVoltage5V.output5V();
       if(targetElestic==5){
           System.out.println("输出电压为5V");
       }else{
           System.out.println("输出电压不为5V");
       }

   }
}
