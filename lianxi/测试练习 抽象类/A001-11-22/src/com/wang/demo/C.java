package com.wang.demo;

public class C extends B {

	public C(String name) {
		super(name);
	}

	@Override
	public void mul(int a, int b) {
		System.out.println(a + "*" + b + "=" + (a * b));
	}

	@Override
	public void div(int a, int b) {
		System.out.println(a + "/" + b + "=" + (a / b));
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a + b));
	}

	@Override
	public void sub(int a, int b) {
		System.out.println(a + "-" + b + "=" + (a - b));
	}

}
