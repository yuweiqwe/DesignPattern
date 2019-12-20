package com.ckp.test.builder;

public class Director {
	
	private AbstractBuilder aBuilder = new ConcreteBuilder();
	private AbstractBuilder bBuilder = new ConcreteBuilder2();
	
	public Product getAProduct(){
		//构造顺序不同，产生不同对象
		aBuilder.setPart();
		aBuilder.setPart1();

		//业务逻辑
		return this.aBuilder.buildProduct();
	}
	
	public Product getBProduct(){
		//构造顺序不同，产生不同对象
		bBuilder.setPart1();
		bBuilder.setPart();

		//业务逻辑
		return this.bBuilder.buildProduct();
	}

    public Product getCProduct(){
        //构造顺序不同，产生不同对象
        bBuilder.setPart1();
        bBuilder.setPart();
        bBuilder.setPart();

        //业务逻辑
        return this.bBuilder.buildProduct();
    }
	
}
