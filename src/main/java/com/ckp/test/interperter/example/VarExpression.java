package com.ckp.test.interperter.example;

import java.util.Map;

public class VarExpression extends Expression {

	private String key;

	public VarExpression(String key) {
		super();
		this.key = key;
	}

	@Override
	public int interperter(Map<String, Integer> var) {
		// TODO Auto-generated method stub
		return var.get(this.key);
	}

}
