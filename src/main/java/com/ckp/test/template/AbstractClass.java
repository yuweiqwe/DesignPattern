package com.ckp.test.template;

public abstract class AbstractClass {
	
	protected abstract void doSomething();
	
	protected abstract void doAnything();
	
	public void templdateMethod(){
		//调用基本方法完成相关逻辑
		this.doSomething();
		this.doAnything();
	}

}
