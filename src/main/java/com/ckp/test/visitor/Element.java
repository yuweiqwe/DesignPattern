package com.ckp.test.visitor;

public abstract class Element {
	
	public abstract void doSomething();
	
	public abstract void accept(IVisitor visitor);

}
