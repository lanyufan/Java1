package com.wang.demo.test2;

public class Mobile implements USB{
	
	private String brand = "";
	private String sd = "aaa";
	
	public Mobile(String brand) {
		this.brand = brand;
	}

	public void call(){
		System.out.println(brand + ",可以通话");
	}
	
	
	
	public String getSD() {
		return sd;
	}

	public void setSD(String sd) {
		this.sd = sd;
	}

	@Override
	public void in(String data) {
		System.out.println(brand + ",进数据：" + data);
		sd += data;
		System.out.println(brand + ",总数据：" + sd);
	}

	@Override
	public String out() {
		System.out.println(brand + ",出数据：" + sd);
		return sd;
	}
	
	
	

}
