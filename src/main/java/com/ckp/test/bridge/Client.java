package com.ckp.test.bridge;

public class Client {
	
	public static void main(String[] args) {
		//定义一个实现化角色
		Implementor imp = new ConcreteImplementor1();
		//定义一个抽象画角色
		Abstraction abs = new RefinedAbstraction(imp);
		//执行 行为
		abs.request();
	}

}
