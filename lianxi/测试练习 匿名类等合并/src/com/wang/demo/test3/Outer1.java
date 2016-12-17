package com.wang.demo.test3;

public class Outer1 {
	
	private String a = "";

	public Outer1(String a) {
		this.a = a;
	}
	
	public void out(){
		System.out.println("a" + a);
	}
	
	
	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}




	public class Inner1{
		private String b = "";

		public Inner1(String b) {
			this.b = b;
		}
		
		public void in(){
			System.out.println("a" + a);
			System.out.println("b" + b);
		}

		public String getB() {
			return b;
		}

		public void setB(String b) {
			this.b = b;
		}
	}
	
}
