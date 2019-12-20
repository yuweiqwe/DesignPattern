package com.ckp.test.builder;

public class Client {
	
	public static void main(String[] args) {
		Director director = new Director();
		
		director.getAProduct().doSomething();
		director.getBProduct().doSomething();
	}
	
}
