package com.wang.demo;

/**
 * 类Demo2。 测试++，--运算符 （1）简单用法 （2）放在前面 （3）放在后面
 * 
 */
public class Demo2 {

	/**
	 * 简单测试
	 */
	public void myTest1() {
		// ++
		// 数据
		int a = 20;
		// 运算
		a++;
		// 输出
		System.out.println("a++:" + a);
		// --
		// 数据
		int b = 30;
		// 运算
		b--;
		// 输出
		System.out.println("b--:" + b);
	}

	/**
	 * 后面
	 */
	public void myTest2() {
		//数据
		int a = 10;
		int b = 0;
		//运算
		b = a++;
		//输出
//		System.out.println("a++:" + a++);
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		/*
		 * ++放后面，先执行代码，再进行自增运算。
		 * 
		 */
	}

	/**
	 * 前面
	 */
	public void myTest3() {
		//数据
		int a = 1;
		int b = 5;
		
		//运算
//		b = ++a;
		
		int c = b+++a;
		
		//输出
//		System.out.println(++a + "++a:");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}
	
	/**
	 * ++ -- 是否能用在小数？
	 */
	public void myTest4(){
		double a = 3.5;
		
		a++;
		
		System.out.println("a++:" + a);
	}
	
	/**
	 * ?;测试。
	 * （1）简单用法
	 * （2）数据类型
	 * （3）嵌套
	 */
	public void myTest5(){
		//用法
		int a = 80;
		int b = 90;
		
		int max = a > b ? a : b;
		System.out.println("max:" + max);
		
		//不同类型
		int c = 50;
		
		boolean pass = c >= 60 ? true : false;
		System.out.println("pass:" + pass);
		
		//嵌套
		int x = 40;
		
		char level = x >= 80 ? 'A' : (x >= 60 ? 'B' : 'C');
		System.out.println("level:" + level);
	}
	
}















