package com.behavioraltype.interpreter;

import java.util.HashMap;

/**
 * 抽象类表达式 通过hashmap键值对 可获取变量的值
 */
public abstract class Expression {

    /**
     * a+b+c
     * 解释公式的数值,key就是公式(表达式) 参数【a,b,c】 value就是具体的值
     * Hashmap{a=10,b=20}
     * @param var
     * @return
     */
    public abstract int interpreter(HashMap<String,Integer> var);
}
