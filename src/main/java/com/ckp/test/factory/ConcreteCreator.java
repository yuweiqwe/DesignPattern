package com.ckp.test.factory;

public class ConcreteCreator extends Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> clazz) {
		// TODO Auto-generated method stub
		T product = null;
		
		try {
			product = clazz.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return (T) product;
	}

}
