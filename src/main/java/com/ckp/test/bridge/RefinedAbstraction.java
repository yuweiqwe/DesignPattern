package com.ckp.test.bridge;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor imp) {
		super(imp);
		// TODO Auto-generated constructor stub
	}

	//修正父类行为
	@Override
	public void request() {
		// TODO Auto-generated method stub
		//业务处理
		
		super.request();
		super.getImp().doAnything();
	}

}
