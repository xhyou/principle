package com.behavioraltype.interpreter;

import java.util.HashMap;

/**
 * 加法解析器
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 返回符号左边的数值+返回符号右边的数值
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var)+super.right.interpreter(var);
    }
}
