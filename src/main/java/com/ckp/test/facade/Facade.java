package com.ckp.test.facade;

/** 
* @ClassName Facade 
* @Description 门面类，不涉及业务逻辑，单纯的调用子系统接口
* @author 余巍 yuweiqwe@126.com 
* @date 2017年3月12日 上午12:03:06 
*  
*/
public class Facade {
	
	private SubClassA a = new SubClassA();
	private SubClassB b = new SubClassB();
	private SubClassC c = new SubClassC();
	private Context context = new Context();
	
	public void methodA(){
		this.a.doSomethingA();
	}
	
	public void methodB(){
		this.b.doSomethingB();
	}
	
	public void methodC(){
		this.c.doSomethingC();
	}
	
	public void methodD(){
		this.context.complexMethod();
	}
	
}
