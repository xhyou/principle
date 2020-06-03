package com.uml.aggregation;

import javax.management.monitor.Monitor;

//表示整体和部分的关系,整体和部分可以分开
//假设离开了鼠标和显示器,这个类还是个电脑
public class Computer {

   private Mouse mouse;

    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
