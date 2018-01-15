package com.ckp.test.visitor;

public class Visitor implements IVisitor {

	public void visit(ConcreteElement1 element) {
		// TODO Auto-generated method stub
		element.doSomething();
	}

	public void visit(ConcreteElement2 element) {
		// TODO Auto-generated method stub
		element.doSomething();
	}

}
