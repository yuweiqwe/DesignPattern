package com.ckp.test.singleton;

public class Singleton1 {

	private static volatile Singleton1 singleton = null;

	private Singleton1() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton1 getInstance(){
		if(singleton != null){
			return singleton;
		}
		synchronized (Singleton1.class) {
			if(singleton == null){
				singleton = new Singleton1();
			}
		}
		return singleton;
	}

}
