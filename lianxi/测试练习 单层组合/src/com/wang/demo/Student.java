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
	private int math;
	private int english;
	private int chinese;
	
	
	//构造
	public Student(){
		
	}
	
	public Student(String name, String gender, int math, int english,
			int chinese) {
		this.name = name;
		this.gender = gender;
		this.math = math;
		this.english = english;
		this.chinese = chinese;
	}
	
	//方法
	public void intro(){
	
		String info = "name:" + name + "\n"
				+ "gender:" + gender + "\n"
		+ "math:" + math + "\n"
		+ "english:" + english + "\n"
		+ "chinese:" + chinese + "\n";
		
		System.out.println(info);
	}
	
	public int total(){
		int t = math + english + chinese;
//		System.out.println("total:" + t);
		return t;
	}
	
	public int avg(){
		
		int avg = total() / 3;
		System.out.println("avg:" + avg);
		
		return avg;
	}

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

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getChinese() {
		return chinese;
	}

	public void setChinese(int chinese) {
		this.chinese = chinese;
	}
	
}






