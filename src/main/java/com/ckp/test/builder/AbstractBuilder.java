package com.ckp.test.builder;

public abstract class AbstractBuilder {
	//设置产品不同部分，以获取不同产品
	public abstract void setPart();
	//建造产品
	public abstract Product buildProduct();

}
