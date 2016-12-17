package com.wang.demo.test1;

public class Dog1 extends Anim{

	public Dog1(String name) {
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
