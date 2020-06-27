package com.behavioraltype.interpreter;

import java.util.HashMap;

/**
 * 抽象的运算符号解析器,每个运算符都有自己左右两个数字有关系
 * 但左右两个数字有可能也是一个解析的结果，无论何种类型，都是Expression的实现类
 */
public abstract class SymbolExpression extends Expression {

    protected Expression left;
    protected Expression right;


    public SymbolExpression(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }


    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
