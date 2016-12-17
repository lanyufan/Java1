package com.wang.demo;

public class B extends A {
	
	public int b = 20;
	
	public B(){
		
	}
	
	public B(int b){
		this.b = b;
	}
	
	public void sub(){
		b--;
		System.out.println("b:" + b);
	}

}
