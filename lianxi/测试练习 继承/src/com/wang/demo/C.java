package com.wang.demo;

public class C extends B{
	
	public int c = 30;
	
	public C(){
		
	}
	
	public C(int c){
		this.c = c;
	}
	
	public void mul(){
		c *= c;
		System.out.println("c:" + c);
	}

}
