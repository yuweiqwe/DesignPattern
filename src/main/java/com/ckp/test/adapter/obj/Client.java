package com.ckp.test.adapter.obj;

public class Client {
	
	public static void main(String[] args) {
		//原有业务逻辑
		Target target = new ConcreteTarget();
		target.request();
		
		//现在增加了适配器角色后的业务逻辑
		target = new Adapter(new Adaptee());
		target.request();
	}

}
