package com.ckp.test.observer.jdk;

import java.util.Observer;

public class Client {
	
	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer realObserver = new RealObserver();
		
		subject.addObserver(realObserver);
		
		subject.doSomething();
	}

}
