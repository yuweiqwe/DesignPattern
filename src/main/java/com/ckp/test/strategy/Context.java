package com.ckp.test.strategy;

public class Context {
	
	private IStrategy strategy;

	public Context(IStrategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void doAnything(){
		this.strategy.doSomething();
	}

}
