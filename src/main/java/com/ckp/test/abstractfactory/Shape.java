package com.ckp.test.abstractfactory;

public abstract class Shape {
	
	//产品类的公共方法
	public void method1(){
		//业务逻辑处理
		System.out.println("Shape method1");
	}
	
	//抽象方法
	public abstract void method2();

}
