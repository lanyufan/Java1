package com.wang.demo.test1;

public class Demo2 implements MyInterface2{
	
	private String type = "";

	public Demo2(String type) {
		this.type = type;
	}
	
	public void run(){
		System.out.println("this is demo,type:" + type);
	}

	@Override
	public void add1() {
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println("我实现了加法，c=" + c);
	}
}
