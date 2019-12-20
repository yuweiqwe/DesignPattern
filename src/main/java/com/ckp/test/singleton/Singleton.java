package com.ckp.test.singleton;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance(){
		return singleton;
	}

}
