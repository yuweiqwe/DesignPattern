package com.ckp.test.iterator;

import java.util.Vector;

public class ConcreteAggregate<T> implements Aggregate<T> {
	
	private Vector<T> vector = new Vector<T>();
	
	public void add(T t) {
		// TODO Auto-generated method stub
		this.vector.add(t);
	}

	public void remove(T t) {
		// TODO Auto-generated method stub
		this.vector.remove(t);
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator<T>(vector);
	}

}
