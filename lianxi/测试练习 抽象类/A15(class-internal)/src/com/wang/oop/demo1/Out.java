package com.wang.oop.demo1;

/**
 * 静态内部类
 */
public class Out {
	
	private int a1 = 10;
	
	private static int a2 = 20;

	public Out() {
	}

	public void testA1(){
		
	}
	
	public static class In{
		
		private int b1 = 100;
		private int b2 = 200;
		
		public In() {
		}
		
		public void testB1(){
			System.out.println("b1:" + b1 + ",b2:" + b2);
		}
		
		public void testB2(){
			//不能访问动态
//			a1++;
			//可以访问静态
			a2++;
		}
		
	}
}
