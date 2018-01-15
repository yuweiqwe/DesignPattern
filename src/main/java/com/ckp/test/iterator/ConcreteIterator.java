package com.ckp.test.iterator;

import java.util.Vector;

public class ConcreteIterator<T> implements Iterator<T> {
	
	private Vector<T> vector = new Vector<T>();
	//定义当前游标
	private int cursor = 0;
	
	public ConcreteIterator(Vector<T> vector) {
		super();
		this.vector = vector;
	}

	public T next() {
		// TODO Auto-generated method stub
		T t = null;
		if(this.hasNext()){
			t = vector.get(cursor++);
		}
		return t;
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(cursor >= vector.size()){
			return false;
		}
		return true;
	}

	public boolean remove() {
		// TODO Auto-generated method stub
		this.vector.remove(this.cursor);
		return true;
	}

}
