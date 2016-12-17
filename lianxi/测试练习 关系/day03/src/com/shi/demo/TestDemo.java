package com.shi.demo;

public class TestDemo {

	public static void main(String[] args) {
		
		Cal cal = new Cal();
		
		//赋值符号测试
		int y = cal.equ(20);
		System.out.println(y);
		
		int i = cal.equ1(15);
		System.out.println(i);
		
		
		//自加、自减测试
		System.out.println(cal.add(9));;
		
		System.out.println(cal.add1(10));
		
		
		//四则运算符测试
		int sum = cal.sum(1, 2, 3, 4);
		System.out.println("加法的运算结果："+sum);
		
		int sub = cal.sub(7, 10);
		System.out.println("减法的运算结果："+sub);
		
		int mul = cal.mul(9, 1024);
		System.out.println("乘法的运算结果："+mul);
		/*
		 * Test类的测试块
		Test test = new Test();
		test.test();	
		
		test.test1(0, 0);
		test.test2('a', "name");
		
		test.test3();
		*/
	}
	
}
