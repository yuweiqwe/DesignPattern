package com.ckp.test.composite;

import java.util.ArrayList;
import java.util.List;

public class Branch implements ICorp {
	
	private ICorp parent;
	private boolean isLeaf = false;
	private String name;
	
	private List<ICorp> children = new ArrayList<ICorp>();

	public Branch(ICorp parent, boolean isLeaf, String name) {
		super();
		this.parent = parent;
		this.isLeaf = isLeaf;
		this.name = name;
	}

	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return this.isLeaf;
	}

	public ICorp getParent() {
		// TODO Auto-generated method stub
		return this.parent;
	}

	public void setParent(ICorp parent) {
		this.parent = parent;
	}

	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ICorp> getChildren() {
		// TODO Auto-generated method stub
		return this.children;
	}

	public void addChildren(ICorp corp) {
		// TODO Auto-generated method stub
		this.children.add(corp);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
