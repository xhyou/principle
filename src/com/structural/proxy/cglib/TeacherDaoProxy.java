package com.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TeacherDaoProxy implements MethodInterceptor {

    private Object target;

    public TeacherDaoProxy(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        //创建一个cglib的工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(this);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("老师开始准备材料");
        Object returnVal = method.invoke(target, args);
        System.out.println("老师收拾");
        return returnVal;
    }
}
