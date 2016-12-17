package com.wang.demo;

public class MyClass1<E> {
	
	private String name = "";
	
	private E obj = null;
	
	
//	private int index = 0;

	public MyClass1(String name) {
		super();
		this.name = name;
	}
	
	public void add(E t){
		
		obj = t;
	}
	
	public E get(){
		
		return obj;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
