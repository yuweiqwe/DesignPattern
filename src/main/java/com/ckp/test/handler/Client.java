package com.ckp.test.handler;

public class Client {
	
	public static void main(String[] args) {
		Handler handler0 = new ConcreteHandler0();
		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		
		handler0.setNextHandler(handler1);
		handler1.setNextHandler(handler2);
		
		Response response = handler0.handleMessage(new Request());
	}
	
}
