package com.ckp.test.observer;

import java.util.Vector;

public abstract class Subject {
	
	private Vector<Observer> obsList = new Vector<Observer>();
	
	public void addObServer(Observer observer){
		this.obsList.addElement(observer);
	}
	
	public void deleteObServer(Observer observer){
		this.obsList.remove(observer);
	}
	
	public void notifyObserver(){
		for (Observer observer : this.obsList) {
			observer.update();
		}
	}

}
