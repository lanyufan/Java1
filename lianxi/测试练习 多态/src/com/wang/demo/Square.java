package com.wang.demo;

public class Square extends Rectangle{
	
	public Square(String name) {
		super(name);
	}
	
	public Square(String name, double a){
		super(name, a, a);
	}
	
	@Override
	public double cir() {
		return super.cir();
	}
	
	@Override
	public double area() {
		return super.area();
	}

}
