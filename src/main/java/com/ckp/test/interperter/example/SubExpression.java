package com.ckp.test.interperter.example;

import java.util.List;
import java.util.Map;

public class SubExpression extends SymbolExpression {
	
	public SubExpression(List<Expression> expressions) {
		super(expressions);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int interperter(Map<String, Integer> var) {
		// TODO Auto-generated method stub
		return super.expressions.get(0).interperter(var) - super.expressions.get(1).interperter(var);
	}

}
