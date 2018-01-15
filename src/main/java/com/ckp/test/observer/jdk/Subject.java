package com.ckp.test.observer.jdk;

import java.util.Observable;

public class Subject extends Observable {
	
	public void doSomething(){
		System.out.println("Subject doSomething");
		super.setChanged();
		super.notifyObservers(new String("msg"));
//		this.notifyObservers();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Subject";
	}

}
