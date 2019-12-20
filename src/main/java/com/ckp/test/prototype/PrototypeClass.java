package com.ckp.test.prototype;

public class PrototypeClass implements Cloneable {

	@Override
	protected PrototypeClass clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PrototypeClass p = null;
		
		try {
			p = (PrototypeClass) super.clone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//异常处理
		}
		
		return p;
	}

}
