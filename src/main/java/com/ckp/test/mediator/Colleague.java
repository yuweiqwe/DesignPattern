package com.ckp.test.mediator;

public abstract class Colleague {
	
	protected AbstractMediator mediator;

	public Colleague(AbstractMediator mediator) {
		super();
		this.mediator = mediator;
	}

}
