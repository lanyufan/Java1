package com.wang.demo.test3;

public class Outer2 {
	
	private String a = "";

	public Outer2(String a) {
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



	public abstract class Inner2{
		private String b = "";

		public Inner2(String b) {
			this.b = b;
		}
		
		public abstract void in();
		public void in1(){
			System.out.println("a:" + getA());
			System.out.println("b:" + getB());
		}

		public String getB() {
			return b;
		}

		public void setB(String b) {
			this.b = b;
		}
	}
	
}
