package com.ckp.test.decorator;

public class ConcreteDecorator1 extends Decorator {
	
	public ConcreteDecorator1(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	private void method2(){
		//增强或者附加功能
		System.out.println("ConcreteDecorator1 method2");
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		super.operate();
		this.method2();
	}

}
