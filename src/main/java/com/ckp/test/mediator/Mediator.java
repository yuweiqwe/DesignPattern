package com.ckp.test.mediator;

public class Mediator extends AbstractMediator {

	@Override
	public void doSomething1() {
		// TODO Auto-generated method stub
		super.colleague1.selfMethod1();
		super.colleague2.selfMethod2();
	}

	@Override
	public void doSimething2() {
		// TODO Auto-generated method stub
		super.colleague1.selfMethod1();
		super.colleague2.selfMethod2();
	}

}
