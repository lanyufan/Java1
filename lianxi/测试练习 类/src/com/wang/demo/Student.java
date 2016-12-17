package com.wang.demo;


/**
 * Student类。
 * （1）属性（name,gender,math,english,chinese）
 * （2）方法（intro，total，avg）
 * 
 */
public class Student {
	
	//属性
	private String name;
	private String gender;
	
	//构造
	public Student(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	//方法
	public void intro(){
	
		String info = "name:" + getName() + "\n"
				+ "gender:" + getGender() + "\n";
		
		System.out.println(info);
	}


	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}






