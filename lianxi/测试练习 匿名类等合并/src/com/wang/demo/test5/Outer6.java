package com.wang.demo.test5;

public interface Outer6 {

	String a = "aaa";
	
	void out();
	
	public class Inner6{
		
		private String b = "bbb";

		public Inner6(String b) {
			this.b = b;
		}
		
		public void in(){
			System.out.println("b:" + b);
		}
	}
}
