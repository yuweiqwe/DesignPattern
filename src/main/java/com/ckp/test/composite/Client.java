package com.ckp.test.composite;

public class Client {

	public static void main(String[] args) {
		ICorp root = new Branch(null, false, "root");
		ICorp branch1 = new Branch(root, false, "branch1");
		ICorp branch2 = new Branch(root, false, "branch2");
		ICorp leaf1 = new Branch(branch1, true, "leaf1");
		ICorp leaf2 = new Branch(branch2, true, "leaf2");
		ICorp leaf3 = new Branch(branch2, true, "leaf3");
		
		root.addChildren(branch1);
		root.addChildren(branch2);
		
		branch1.addChildren(leaf1);
		branch2.addChildren(leaf2);
		branch2.addChildren(leaf3);
		
		display(root);
	}
	
	public static void display(ICorp corp){
		if(corp.isLeaf()){
			System.out.println(corp);
		}else{
			System.out.println(corp);
			for (ICorp children : corp.getChildren()) {
				display(children);
			}
		}
	}
		
}
