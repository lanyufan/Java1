package com.wang.demo.test2;


public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + ",吃骨头");
	}

	@Override
	public void sleep() {
		System.out.println(getName() + ",趴着睡");
	}
	
}
