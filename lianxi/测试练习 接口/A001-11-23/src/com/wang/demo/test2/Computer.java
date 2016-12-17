package com.wang.demo.test2;

public class Computer implements USB {

	private String brand = "";
	private String hd = "";
	
	public Computer(String brand) {
		this.brand = brand;
	}

	public void cal(){
		System.out.println(brand + ",可以计算");
	}
	
	public String getHD() {
		return hd;
	}

	public void setHD(String hd) {
		this.hd = hd;
	}

	@Override
	public void in(String data) {
		System.out.println(brand + ",进数据：" + data);
		hd += data;
		System.out.println(brand + ",总数据：" + hd);
	}

	@Override
	public String out() {
		System.out.println(brand + ",出数据：" + hd);
		return hd;
	}
}
