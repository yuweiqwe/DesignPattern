package com.ckp.test.interperter.example;

import java.util.List;

public abstract class SymbolExpression extends Expression {
	
	protected List<Expression> expressions;

	public SymbolExpression(List<Expression> expressions) {
		super();
		this.expressions = expressions;
	}

}
