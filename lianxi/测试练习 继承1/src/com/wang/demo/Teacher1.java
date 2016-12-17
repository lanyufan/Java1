package com.wang.demo;

import com.wang.demo.test1.Person1;



public class Teacher1 extends Person1{

	public Teacher1(String name, int age) {
		super(name, age);
	}

	void teach(){
		System.out.println(name);
		
		eat();
	}
	
	
}
