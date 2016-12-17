package com.wang.demo.test5;


public class Dog extends Anim{

	public Dog(String name) {
		super(name);
	}
	
	public void watch(){
		System.out.println(getName() + ",看门");
	}
	
	@Override
	public void eat() {
		System.out.println(getName() + "，吃骨头");
	}
}
