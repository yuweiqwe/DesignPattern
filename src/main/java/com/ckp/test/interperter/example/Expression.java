package com.ckp.test.interperter.example;

import java.util.Map;

public abstract class Expression {
	//解释公式和数值，其中var中key值是公式中的参数，value值是具体的数字
	public abstract int interperter(Map<String, Integer> var);

}
