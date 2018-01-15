package com.ckp.test.state;

public class Context {
	
	public static final State STATE1 = new ConcreteState1();
	public static final State STATE2 = new ConcreteState2();
	
	private State currentState;

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
		//切换状态
		this.currentState.setContext(this);
		
	}
	//行为委托
	public void handle1(){
		this.currentState.handle1();
	}
	//行为委托
	public void handle2(){
		this.currentState.handle2();
	}
	
}
