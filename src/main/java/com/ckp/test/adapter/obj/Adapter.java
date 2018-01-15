package com.ckp.test.adapter.obj;

public class Adapter implements Target {
	
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	public void request() {
		// TODO Auto-generated method stub
		this.adaptee.doSomething();
	}

}
