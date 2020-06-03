package com.designpattern.ocp;
//遵守开闭原则的例子
public class T_02_Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

//修改方

/**
 * 当我每次需要扩展一个类的时候,我都不需要在修改方去修改代码
 */
class GraphicEditor{
  public void drawShape(Shape shape){
      shape.drawShape();
  }

}

abstract class Shape{
    abstract void drawShape();
}

//提供方
class Rectangle extends Shape{
    @Override
    void drawShape() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape{

    @Override
    void drawShape() {
        System.out.println("绘制圆形");
    }
}