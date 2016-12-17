package com.wang.demo;

public class Triangle extends Shape{
	
	private double a = 0;
	private double b = 0;
	private double c = 0;

	public Triangle(String name) {
		super(name);
	}

	public Triangle(String name, double a, double b, double c) {
		super(name);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double cir() {
		return a + b + c;
	}

	@Override
	public double area() {
		return a * b * c;
	}
	
	

}
