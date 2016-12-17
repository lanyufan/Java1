package com.wang.demo.test1;

public abstract class Anim {
	
	private String name = "";

	public Anim(String name) {
		this.name = name;
	} 
	
	public abstract void eat();
	
	public abstract void sleep();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
