package com.wang.demo;

public class Father extends Member{

	public Father(String name, int age) {
		super(name, age);
	}

	@Override
	public void getup() {
		System.out.println(getName()+",每天6点起床");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+",每天2点起床");
	}

	@Override
	public void work() {
		System.out.println(getName()+",每天工作10小时");
	}

	@Override
	public void play() {
		System.out.println(getName()+",每天加班2小时");
	}
}





