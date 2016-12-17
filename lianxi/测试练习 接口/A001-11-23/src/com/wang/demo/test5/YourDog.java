package com.wang.demo.test5;

public class YourDog extends Dog{

	public YourDog(String name) {
		super(name);
	}
	
	public void walk(){
		System.out.println(getName() + ",会站着走");
	}

	@Override
	public void eat() {
		System.out.println(getName() + ",吃炸酱面");
	}
}
