package com.behavioraltype.interpreter;

import java.util.HashMap;
import java.util.Stack;

public class Calculator {

    private Expression expression;

    //构造函数传参,并解析
    public Calculator(String expStr){//a+b
        //安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        char[] charsArray = expStr.toCharArray();

        Expression left = null;
        Expression right = null;
        for(int i=0 ;i<charsArray.length;i++){
            switch (charsArray[i]){ //a+b+c
                case '+':
                    left=stack.pop();
                    right=new VarExpression(String.valueOf(charsArray[++i]));
                    stack.push(new AddExpression(left,right));
                    break;
                case '-':
                    left=stack.pop();
                    right=new VarExpression(String.valueOf(charsArray[++i]));
                    stack.push(new SubExpression(left,right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charsArray[i])));
                    break;
            }
        }
        this.expression = stack.pop();
    }

    public int run (HashMap<String,Integer> var){
        //将表达式和var绑定
        return this.expression.interpreter(var);
    }
}
