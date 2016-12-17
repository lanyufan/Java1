package com.wang.demo;

public class MyOut {

	//属性
	private String name;
	
	//定义静态
//	public static MyPrint print = new MyPrint("ccc");
	public MyPrint print = new MyPrint("ccc");

	//构造
	public MyOut(String name) {
		this.name = name;
	}
	
	//方法
	public void myPrint(){
		System.out.println(name + ",this is MyOut class");
	}
	
	
}
