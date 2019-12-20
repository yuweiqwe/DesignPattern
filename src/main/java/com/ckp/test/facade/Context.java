package com.ckp.test.facade;

public class Context {
	
	private SubClassA a = new SubClassA();
	private SubClassB b = new SubClassB();
	
	//聚合业务
	public void complexMethod(){
		this.a.doSomethingA();
		this.b.doSomethingB();
	}

}
