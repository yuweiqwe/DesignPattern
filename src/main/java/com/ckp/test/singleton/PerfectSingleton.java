package com.ckp.test.singleton;

public class PerfectSingleton {
	
	private PerfectSingleton() {
		// TODO Auto-generated constructor stub
		System.out.println("PerfectSingleton constructor is called");
	}
	
	public static PerfectSingleton getInstance(){
		return SingletonHolder.singleton;
	}
	
	public void doSomething(){
		System.out.println("PerfectSingleton doSomething");
	}
	
	private static class SingletonHolder{
		public static PerfectSingleton singleton = new PerfectSingleton();
	}

}
