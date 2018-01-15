package com.ckp.test.command;

public abstract class Command {
	
	protected final Receiver receiver;

	public Command(Receiver receiver) {
		super();
		this.receiver = receiver;
	}
	
	public abstract void execute();
	
}
