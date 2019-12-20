package com.ckp.test.template;

public class Client {
	
	public static void main(String[] args) {
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		
		class1.templdateMethod();
		class2.templdateMethod();
	}
	
}
