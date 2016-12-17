package com.wang.demo;

public class MyClass<X> {
	
	private String name = "";
	
	private X obj = null;
	
	
//	private int index = 0;

	public MyClass(String name) {
		super();
		this.name = name;
	}
	
	public void add(X t){
		
		obj = t;
	}
	
	public X get(){
		
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
