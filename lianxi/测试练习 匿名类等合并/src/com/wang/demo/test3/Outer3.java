package com.wang.demo.test3;

public class Outer3 {

	private String a = "";

	public Outer3(String a) {
		this.a = a;
	}

	public void out() {
		System.out.println("a" + a);
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public interface Inner3 {

		String b = "bbb";

		void in();
	}

}
