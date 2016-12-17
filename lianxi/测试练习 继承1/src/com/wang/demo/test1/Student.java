package com.wang.demo.test1;

public class Student extends Person{

	public Student(String name, int age) {
		super(name, age);
	}
	
	void study(){
		System.out.println(name + ",学习");
	}

}
