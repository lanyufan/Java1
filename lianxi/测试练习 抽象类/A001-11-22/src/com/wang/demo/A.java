package com.wang.demo;

public abstract class A {
	
	private String name;

	public A(String name) {
		this.name = name;
	}
	
	public abstract void add(int a, int b);
	public abstract void sub(int a, int b);
	
}
