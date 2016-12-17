package com.wang.demo.test2;

public class Person {
	
	private String name="";
	
	private MyListener listener = null;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setListener(MyListener l){
		listener = l;
	}
	
	//行为
	public void click(String info){
		
		listener.onClick(getName());
	}
	

}
