package com.ckp.test.builder;

public class ConcreteBuilder2 extends AbstractBuilder {
	
	private Product product = new Product();
	
	@Override
	public void setPart() {
		// TODO Auto-generated method stub
		//内部逻辑处理
		System.out.println("ConcreteBuilder2 setPart");
	}

	@Override
	public Product buildProduct() {
		// TODO Auto-generated method stub
		return this.product;
	}

}
