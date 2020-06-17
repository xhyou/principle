package com.behavioraltype.template;

//表示豆浆的抽象类
public abstract  class SoyaMilk {

    public void make(){
       select();
       if(customerWantCondiments()) {
           addCondiments();
       }
       soak();
    }

    public void select(){
        System.out.println("选择好的新鲜黄豆");
    }
    public abstract void addCondiments();

    public void soak(){
        System.out.println("黄豆和配料开始浸泡");
    }

    //钩子方法,子类自定义是否需要改变它实现不同的方法
    boolean customerWantCondiments(){
        return true;
    }
}
