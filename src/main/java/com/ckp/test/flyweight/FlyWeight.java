package com.ckp.test.flyweight;

public abstract class FlyWeight {
	//内部状态
	private String instrinsic;
	//外部状态
	private Extrinsic extrinsic;
	
	public FlyWeight(Extrinsic extrinsic) {
		super();
		this.extrinsic = extrinsic;
	}
	
	public abstract void operate();

	public String getInstrinsic() {
		return instrinsic;
	}

	public void setInstrinsic(String instrinsic) {
		this.instrinsic = instrinsic;
	}

}
