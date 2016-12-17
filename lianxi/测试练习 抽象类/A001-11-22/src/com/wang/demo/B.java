package com.wang.demo;

public abstract class B extends A{

	public B(String name) {
		super(name);
	}
	
	public abstract void mul(int a, int b);
	public abstract void div(int a, int b);
}
