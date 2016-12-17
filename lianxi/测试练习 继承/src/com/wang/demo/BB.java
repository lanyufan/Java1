package com.wang.demo;

public class BB extends AA{
	
	public int b1 = 100;
	public int b2 = 200;
	
	//父类中有个变量是a1=10.
	//覆盖
//	public int a1 = 5;
	
	public void mul(){
		b1 *= 10;
		b2 *= 10;
		System.out.println("b1:" + b1);
		System.out.println("b2:" + b2);
	}
	
	public void div(){
		b1 /= 2;
		b2 /= 2;
		System.out.println("b1:" + b1);
		System.out.println("b2:" + b2);
	}
	
	/**
	 * 方法重写
	 */
//	@Override
	public void add() {
		int b = b1 + b2;
		System.out.println("add:" + b);
	}
	
//	@Override
//	private void add() {
//		int b = b1 + b2;
//		System.out.println("add:" + b);
//	}

	
	/**
	 * 测试父类属性
	 */
	public void test1(){
//		int x = super.a1;
//		int y = super.a2;
//		System.out.println("x=" + x);
//		System.out.println("y=" + y);
	}
	
	public void test2(){
//		super.add();
//		super.sub();
		
	}

}
