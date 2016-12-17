package com.wang.demo;

public abstract class Shape {
	
	private String name = "";

	public Shape(String name) {
		this.name = name;
	}
	
	public abstract double cir();
	public abstract double area();

}
