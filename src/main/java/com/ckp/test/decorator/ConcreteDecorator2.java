package com.ckp.test.decorator;

public class ConcreteDecorator2 extends Decorator {
	
	public ConcreteDecorator2(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	
	private void method1(){
		//增强或者附加功能
		System.out.println("ConcreteDecorator1 method1");
	}

	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.method1();
		super.operate();
	}

}
