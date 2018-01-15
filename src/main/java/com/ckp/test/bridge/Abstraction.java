package com.ckp.test.bridge;

public abstract class Abstraction {
	
	private Implementor imp;

	public Abstraction(Implementor imp) {
		super();
		this.imp = imp;
	}
	
	//自身的行为和属性
	public void request(){
		this.imp.doSomething();
	}

	public Implementor getImp() {
		return imp;
	}

}
