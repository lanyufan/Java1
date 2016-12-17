package com.wang.enu.test3;

public enum Color {
	
	RED("红色",1), YELLOW("黄色",2), GREEN("绿色",3);
	
	private String name;
	private int index;
	
	private Color(String name, int index) {
		this.name = name;
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
