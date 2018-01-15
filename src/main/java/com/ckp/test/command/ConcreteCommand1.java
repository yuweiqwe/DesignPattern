package com.ckp.test.command;

public class ConcreteCommand1 extends Command {
	
	public ConcreteCommand1() {
		// TODO Auto-generated constructor stub
		super(new ConcreteReceiver1());
	}
	
	public ConcreteCommand1(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.receiver.doSomething();
	}

}
