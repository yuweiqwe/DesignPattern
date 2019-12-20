package com.ckp.test.visitor;

public class ConcreteElement1 extends Element {

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("ConcreteElement1 doSomething");
	}

	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
