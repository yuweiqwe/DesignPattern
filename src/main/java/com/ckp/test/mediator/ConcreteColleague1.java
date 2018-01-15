package com.ckp.test.mediator;

public class ConcreteColleague1 extends Colleague {

	public ConcreteColleague1(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 自有方法
	 */
	public void selfMethod1(){
		System.out.println("ConcreteColleague1处理自己的业务逻辑 单一职责");
	}
	
	/**
	 * 依赖方法
	 */
	public void depMethod1(){
		System.out.println("ConcreteColleague1处理自己的业务逻辑 单一职责");
		//自己不能处理的业务逻辑，委托给中介者（不是自己职责的业务逻辑）
		super.mediator.doSomething1();
	}

}
