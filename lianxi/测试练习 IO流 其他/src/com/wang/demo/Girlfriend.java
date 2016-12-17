package com.wang.demo;

import java.io.Serializable;

public class Girlfriend implements Serializable{
	
	private String name;
	private int age;
	
	
	public Girlfriend(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "-" + age;
	}

}
