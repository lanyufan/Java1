package com.wang.demo.test2;

public class MyButton implements MyListener{

	private String name = "button";
	
	
	
	@Override
	public void onClick(String info) {
		System.out.println(getName() + ",被点击了：" + info);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
