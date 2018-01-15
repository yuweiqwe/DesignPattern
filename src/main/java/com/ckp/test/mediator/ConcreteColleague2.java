package com.ckp.test.mediator;

public class ConcreteColleague2 extends Colleague {
	
	public ConcreteColleague2(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 自有方法
	 */
	public void selfMethod2(){
		System.out.println("ConcreteColleague2处理自己的业务逻辑 单一职责");
	}
	
	/**
	 * 依赖方法
	 */
	public void depMethod2(){
		System.out.println("ConcreteColleague2处理自己的业务逻辑 单一职责");
		//自己不能处理的业务逻辑，委托给中介者（不是自己职责的业务逻辑）
		super.mediator.doSimething2();
	}

}
