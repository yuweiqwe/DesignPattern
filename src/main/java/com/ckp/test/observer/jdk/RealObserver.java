package com.ckp.test.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class RealObserver implements Observer {

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("RealObserver update");
		System.out.println(o);
		System.out.println(arg);
	}

}
