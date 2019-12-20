package com.ckp.test.observer;

public class Client {
	
	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();
		
		Observer observer = new ConcreteObserver();
		
		subject.addObServer(observer);
		
		subject.doSomething();
	}

}
