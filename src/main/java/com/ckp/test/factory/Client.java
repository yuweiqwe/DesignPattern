package com.ckp.test.factory;

public class Client {
	
	public static void main(String[] args) {
		Creator creator = new ConcreteCreator();
		Product product = creator.createProduct(ConcreteProduct1.class);
		product.method1();
	}

}
