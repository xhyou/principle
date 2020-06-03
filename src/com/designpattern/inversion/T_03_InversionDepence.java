package com.designpattern.inversion;

public class T_03_InversionDepence {
    public static void main(String[] args) {
        //方式一
        HTC htc = new HTC();
        OpenAndClose1 openAndClose1 = new OpenAndClose1();
        openAndClose1.open(htc);
        //方式二:
        HTC2 htc2 = new HTC2();
        OpenAndClose2 openAndClose2 = new OpenAndClose2(htc2);
        openAndClose2.open();
        //方式三:
        HTC3 htc3 = new HTC3();
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(htc3);
        openAndClose3.open();

    }
}

class HTC implements ITV{

    @Override
    public void play() {
        System.out.println("打开电视机");
    }
}

//方式1：通过接口传递的方式实现依赖
interface  IOpenAndClose{
     void open(ITV tv);
}

interface ITV{
     void play();
}

class OpenAndClose1 implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}

//方式2:通过构造方法传递依赖
class HTC2 implements ITV2{

    @Override
    public void play() {
        System.out.println("打开电视机");
    }
}

interface IOpenAndClose2{
    void open();
}
interface ITV2{
    void play();
}
class OpenAndClose2 implements IOpenAndClose2{

    public ITV2 itv2;

    public OpenAndClose2(ITV2 itv2){
        this.itv2 = itv2;
    }

    @Override
    public void open() {
        this.itv2.play();
    }
}

//方式3 通过setter的方式
interface IOpenAndClose3{
    void open();
    void setTv(ITV3 itv3);
}

interface ITV3{
    void play();
}

class OpenAndClose3 implements IOpenAndClose3{

    private ITV3 itv3;

    @Override
    public void open() {
        this.itv3.play();
    }

    @Override
    public void setTv(ITV3 itv3) {
        this.itv3=itv3;
    }
}

class HTC3 implements ITV3{

    @Override
    public void play() {
        System.out.println("打开电视机");
    }
}
