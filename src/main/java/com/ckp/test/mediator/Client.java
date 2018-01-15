package com.ckp.test.mediator;

public class Client {
	
	public static void main(String[] args) {
		AbstractMediator mediator = new Mediator();
		
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		
		mediator.setColleague1(colleague1);
		mediator.setColleague2(colleague2);
		
		colleague1.selfMethod1();
		colleague1.depMethod1();
	}

}
