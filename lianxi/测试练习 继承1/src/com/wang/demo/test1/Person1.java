package com.wang.demo.test1;

public class Person1 {
	
	protected String name;
	protected int age;
	
	public Person1(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	protected void eat(){
		System.out.println(name + ",每天需要吃饭");
	}
	
	protected void sleep(){
		System.out.println(name + ",每天需要睡觉");
	}
}
