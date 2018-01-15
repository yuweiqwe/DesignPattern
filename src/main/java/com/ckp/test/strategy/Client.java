package com.ckp.test.strategy;

/** 
* @ClassName Client 
* @Description 高层类不依赖algorithm算法，只依赖Context，由Context去解决算法问题
* @Example 比如通过Spring注入不用strategy到Context中
* @author 余巍 yuweiqwe@126.com 
* @date 2017年3月11日 上午11:19:10 
*  
*/
public class Client {
	
	public static void main(String[] args) {
		IStrategy strategy1 = new ConcreteStrategy1();
		IStrategy strategy2 = new ConcreteStrategy2();
		
		Context context = new Context(strategy1);
		context.doAnything();
		
		context = new Context(strategy2);
		context.doAnything();
	}

}
