package com.wang.ref;

public class Student {

	public String nation;
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void intro() {
		System.out.println("name:" + name + ",age:" + age);
	}

	public void study() {
		System.out.println(name + ",我喜欢计算机");
	}

}
