package com.wang.demo;

public class MyPrint {
	
	//属性
	private String name;
	
	//构造
	public MyPrint(String name){
		this.name = name;
	}
	
	//方法
	public void print(){
		System.out.println(name + ",this is MyPrint class");
	}

}
