package com.wang.demo.test5;

public class Anim {
	
	private String name = "";
	
	
	public Anim(String name) {
		this.name = name;
	}

	public void eat(){
		System.out.println(name + ",吃东西");
	}
	
	public void sleep(){
		System.out.println(name + ",睡觉");
	}
	
	public String getName(){
		return name;
	}

}
