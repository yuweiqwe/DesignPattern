package com.ckp.test.interperter.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class InterperEngine {
	
	private Expression expression;
	
	public InterperEngine(String exp) {
		// TODO Auto-generated constructor stub
		//定义一个栈，安排运算的先后顺序
		Stack<Expression> stack = new Stack<Expression>();
		//表达式拆分为字符数组
		char[] charArray = exp.toCharArray();
		
		Expression left = null;
		Expression right = null;
		List<Expression> expressions = null;
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
			case '+':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				
				expressions = new ArrayList<Expression>();
				expressions.add(left);
				expressions.add(right);
				
				stack.push(new AddExpression(expressions));
				break;
			case '-':
				left = stack.pop();
				right = new VarExpression(String.valueOf(charArray[++i]));
				
				expressions = new ArrayList<Expression>();
				expressions.add(left);
				expressions.add(right);
				
				stack.push(new SubExpression(expressions));
				break;
			default:
				stack.push(new VarExpression(String.valueOf(charArray[i])));
				break;
			}
		}
		
		this.expression = stack.pop();
		
	}
	
	public int run(Map<String, Integer> var){
		return this.expression.interperter(var);
	}

}
