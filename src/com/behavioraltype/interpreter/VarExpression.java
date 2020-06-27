package com.behavioraltype.interpreter;

import java.util.HashMap;

/**
 * 变量的解析器:
 */
public class VarExpression extends  Expression {

    //key=a,key=b,key=c
    private String key;

    public VarExpression(String key){
        this.key = key;
    }

    /**
     * @param var
     * @return
     * 根据变量的名称 返回对应的值
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
