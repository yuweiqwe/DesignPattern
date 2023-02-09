package com.ckp.test.state;

public class ConcreteState1 extends State {

	@Override
	public void handle1() {
		// TODO Auto-generated method stub
		//本状态下必须处理的逻辑
		System.out.println("ConcreteState1 handle1");
	}

	@Override
	public void handle2() {
		// TODO Auto-generated method stub
		//设置当前状态为state2
		super.context.setCurrentState(Context.STATE2);
		System.out.println("ConcreteState1 handle2");
	}

}
