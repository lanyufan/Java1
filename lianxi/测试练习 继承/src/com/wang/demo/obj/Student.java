package com.wang.demo.obj;

public class Student {
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		//调用Oject类的默认构造，构造父类对象
		super();
		// 构造子类对象
		this.name = name;
		this.age = age;
	}
	
//	public void intro(){
//		System.out.println("name:" + name + ",age:" + age);
//	}
	
	/**
	 * 重写toString()
	 */
	@Override
	public String toString() {
		
		//返回的父类Object的toString()
//		return super.toString();
		String s = name + "," + age;
		return s;
	}
	

}
