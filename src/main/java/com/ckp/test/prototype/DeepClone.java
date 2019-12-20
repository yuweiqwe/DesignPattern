package com.ckp.test.prototype;

import java.util.ArrayList;

public class DeepClone implements Cloneable {
	
	private ArrayList<String> list = new ArrayList<String>();

	@Override
	protected DeepClone clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepClone d = null;
		
		try {
			d = (DeepClone) super.clone();
			d.list = (ArrayList<String>) list.clone();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return d;
	}

}
