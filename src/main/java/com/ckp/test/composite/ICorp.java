package com.ckp.test.composite;

import java.util.List;

public interface ICorp extends ILeaf {
	
	public void setParent(ICorp parent);
	
	public ICorp getParent();
	
	public List<ICorp> getChildren();
	
	public void addChildren(ICorp corp);
	
}
