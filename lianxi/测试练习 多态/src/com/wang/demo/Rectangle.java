package com.wang.demo;

public class Rectangle extends Shape{
	
	private double a = 0;
	private double b = 0;

	public Rectangle(String name) {
		super(name);
	}

	public Rectangle(String name, double a, double b) {
		super(name);
		this.a = a;
		this.b = b;
	}



	@Override
	public double cir() {
		return 2*(a + b);
	}

	@Override
	public double area() {
		return a * b;
	}
}
