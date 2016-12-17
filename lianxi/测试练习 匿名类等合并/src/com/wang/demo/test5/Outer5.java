package com.wang.demo.test5;

public abstract class Outer5 {

	private String a = "";

	public Outer5(String a) {
		this.a = a;
	}
	
//	public void out(){
//		System.out.println("a:" + a);
//	}
	
	public abstract void out();
	
	public class Inner5{
		
		private String b = "";

		public Inner5(String b) {
			this.b = b;
		}
		
		public void in(){
//			System.out.println("a:" + a);
			System.out.println("b:" + b);
		}
		
		
	}
	
	
}
