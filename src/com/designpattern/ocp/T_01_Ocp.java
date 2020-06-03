/*
package com.designpattern.ocp;
//不遵守开闭原则的例子
public class T_01_Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

//修改方

*/
/**
 * 当我每次需要扩展一个类的时候,我都需要在修改方去修改代码
 *//*

class GraphicEditor{
  public void drawShape(Shape shape){
      if(shape.m_type ==1){
          drawRectangle(shape);
      }else if(shape.m_type==2){
          drawCircle(shape);
      }
  }

  public void drawRectangle(Shape r){
      System.out.println("绘制矩形");
  }

  public void drawCircle(Shape c){
      System.out.println("绘制圆形");
  }
}

class Shape{
    int m_type;
}

//提供方
class Rectangle extends Shape{
    Rectangle(){
        super.m_type =1;
    }
}

class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}*/
