package com.wang.demo.test1;

public class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	void eat(){
		System.out.println(name + ",每天需要吃饭");
	}
	
	void sleep(){
		System.out.println(name + ",每天需要睡觉");
	}
}
