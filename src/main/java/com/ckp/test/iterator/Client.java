package com.ckp.test.iterator;

public class Client {
	
	public static void main(String[] args) {
		Aggregate<String> collection = new ConcreteAggregate<String>();
		
		initAggregate(collection);
		
		Iterator<String> iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	public static void initAggregate(Aggregate<String> collection){
		for (int i = 0; i < 10; i++) {
			collection.add(String.valueOf(i));
		}
	} 

}
