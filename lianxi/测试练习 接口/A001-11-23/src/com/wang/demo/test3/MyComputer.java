package com.wang.demo.test3;


public class MyComputer implements MyUSB, HDMI{
	
	private String brand = "";
	private String data = "aaaa";
	
	public MyComputer(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return brand + ",data:" + data;
	}

	@Override
	public void in(String data) {
	}

	@Override
	public String out1() {
		return data;
	}

	@Override
	public String out2() {
		
		return data;
	}

}
