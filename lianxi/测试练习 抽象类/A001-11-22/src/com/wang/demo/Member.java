package com.wang.demo;

public abstract class Member {
	
	//属性
	private String name = "";
	private int age = 0;
	
	
	//构造
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/*
	 * 定义规则，
	 * 子类们去各自实现。 
	 */
	//方法
	public abstract void getup();
	
	public abstract void sleep();
	
	public abstract void work();
	
	public abstract void play();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}










