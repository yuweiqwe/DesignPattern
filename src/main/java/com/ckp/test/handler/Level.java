package com.ckp.test.handler;

public enum Level {
	
	Level0(0),
	Level1(1),
	Level2(2),
	Level3(3);
	
	private int level;
	
	private Level(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}

	public int getLevel() {
		return level;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "_NAME";
	}
	
	public static void main(String[] args) {
		System.out.println(Level0);
		System.out.println(Level0.getLevel());
	}

}
