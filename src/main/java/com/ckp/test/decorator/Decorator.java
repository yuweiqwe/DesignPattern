package com.ckp.test.decorator;

public abstract class Decorator extends Component {
	
	private Component component;
	
	//通过构造函数传递被修饰者
	public Decorator(Component component) {
		super();
		this.component = component;
	}
	
	//委托给被修饰者执行
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		this.component.operate();
	}

}
