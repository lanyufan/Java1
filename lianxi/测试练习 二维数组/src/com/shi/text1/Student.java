package com.shi.text1;

public class Student {
	/**
	 *构造方法（函数）
	 */
	String name;
	String gender;
	int age;
	
	public Student(int age) {
		super();
		this.age = age;
	}
	public Student(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public Student(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String toString() {
		return name+age+gender;
	}

}
