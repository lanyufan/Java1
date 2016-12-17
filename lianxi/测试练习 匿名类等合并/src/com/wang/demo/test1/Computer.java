package com.wang.demo.test1;

public class Computer implements USB{

	@Override
	public void in() {
		System.out.println("电脑输入数据");
	}

	@Override
	public void out() {
		System.out.println("电脑输出数据");
	}

}
