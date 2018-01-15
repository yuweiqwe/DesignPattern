package com.ckp.test.memento;

public class Client {
	
	public static void main(String[] args) {
		Originator originator = new Originator();
		System.out.println(originator.getState());
		//定义备忘录管理员
		Caretaker caretaker = new Caretaker();
		//创建一个备份
		caretaker.setMemento(originator.createMemento());
		originator.setState("i am bad");
		System.out.println(originator.getState());
		//恢复一个备份
		originator.restoreMemento(caretaker.getMemento());
		System.out.println(originator.getState());
	}

}
