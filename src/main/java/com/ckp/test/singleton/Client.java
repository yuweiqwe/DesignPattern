package com.ckp.test.singleton;

public class Client {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			PerfectSingleton singleton = PerfectSingleton.getInstance();
			singleton.doSomething();
		}
	}

}
