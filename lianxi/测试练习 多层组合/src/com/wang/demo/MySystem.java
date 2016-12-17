package com.wang.demo;

public class MySystem {
	
	//属性
//	private String name;
	public String name;
	
	//定义动态变量
//	public MyOut out = new MyOut("bbb");
	
	//定义静态变量
	public static MyOut out = new MyOut("bbb");
	
	//构造
	public MySystem(String name) {
		this.name = name;
	}
	
	//方法
	public void intro(){
		System.out.println("name:" + name);
	}

}
