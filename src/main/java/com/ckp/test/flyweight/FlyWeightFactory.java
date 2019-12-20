package com.ckp.test.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {
	
	private static Map<Extrinsic, FlyWeight> pool = new HashMap<Extrinsic, FlyWeight>();
	
	public static FlyWeight getFlyWeight(Extrinsic extrinsic){
		FlyWeight flyWeight = null;
		
		if(pool.containsKey(extrinsic)){
			return pool.get(extrinsic);
		}
		
		flyWeight = new ConcreteFlyWeight1(extrinsic);
		pool.put(extrinsic, flyWeight);
		
		return flyWeight;
	}

}
