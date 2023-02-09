package com.ckp.test.state;

public class ConcreteState2 extends State {

	@Override
	public void handle1() {
		// TODO Auto-generated method stub
		//设置当前状态为state1
		super.context.setCurrentState(Context.STATE1);
		System.out.println("ConcreteState2 的 handle1 方法");
	}

	@Override
	public void handle2() {
		// TODO Auto-generated method stub
		//本状态下必须处理的逻辑
		System.out.println("ConcreteState2 handle2");
	}

}
