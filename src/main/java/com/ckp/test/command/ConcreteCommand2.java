package com.ckp.test.command;

public class ConcreteCommand2 extends Command {
	
	public ConcreteCommand2() {
		// TODO Auto-generated constructor stub
		super(new ConcreteReceiver2());
	}
	
	public ConcreteCommand2(Receiver receiver) {
		super(receiver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		super.receiver.doSomething();
	}

}
