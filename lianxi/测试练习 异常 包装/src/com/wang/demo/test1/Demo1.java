package com.wang.demo.test1;



public class Demo1 {
	
	public void test1() throws MyException{
		int a = 10;
		int b = 0;
		int c = 0;
		
		if(b == 0){
			throw new MyException("divitor == 0");
		}
		
		c = a / b;
		
		System.out.println("c=" + c);
	}
	
	/**
	 * 包装类
	 */
	public void test2(){
//		//基本类型
//		int a = 10;
//		
//		//包装类（复杂类型）
//		Integer b = 10;
//		Integer c1 = new Integer(10);
//		/*
//		 * 包装基本类型，让基本类型具备面向对象的能力。
//		 */
//		Integer c2 = new Integer(20);
//		
//		int d = c1 + c2;
//		
//		//装箱，拆箱
//		Integer c3 = new Integer(40);
//		int e = c3.intValue();
//		
//		//自动装箱，拆箱
//		Integer c4 = new Integer(50);
//		int c5 = 60;
//		int c6 = c4 + c5;
//		
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
//		System.out.println("d=" + d);
//		System.out.println("c6=" + c6);
		
		
		//字节类型
//		byte x1 = 10;
//		Byte x2 = new Byte((byte)10);
//		
//		short x3 = 10;
//		Short x4 = new Short((short)10);
//		
//		int x5 = 10;
//		Integer x6 = new Integer(10);
//		
//		long x7 = 10;
//		Long x8 = new Long(10);
//		
//		float x9 = 3.14f;
//		Float x10 = new Float(3.14f);
		
		//
//		int a = 3;
//		Integer a = new Integer(255);
////		String bin = a.toBinaryString(a);
//		String bin = Integer.toHexString(15);
//		System.out.println("bin:" + bin);
		
//		Integer a = new Integer(3);
//		Integer b = Integer.valueOf(3);
		
//		int a = 255;
//		System.out.println("a bin:" + Integer.toBinaryString(a));
//		
//		int b = Integer.reverse(255);
//		System.out.println("b bin:" + Integer.toBinaryString(b));
//		
////		System.out.println("a:" + a);
//		
//		StringBuilder s1 = new StringBuilder("abcde");
//		System.out.println("s1:" + s1.toString());
//		
//		StringBuilder s2 = s1.reverse();
//		System.out.println("s2:" + s2.toString());
		
		Double b;
		Boolean b1;
		Character c;
		
	}
	
	
	

}












