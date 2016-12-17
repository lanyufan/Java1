package com.shi.demo1;

public class Contact {

	//用于表示关系的数据类型 boolean  true  false
	
	boolean b1 = true;
	boolean b2 = false;
	
	//大于号测试
	public boolean test1() {
		b1 = 1>2;
		return b1;
	}
	
	//小于号测试
	public boolean test2() {
		b2 = 1<2;
		return b2;
	}
	
	//大于等于号测试  >=
	public boolean test3(int x , int y) {
		boolean b = x>=y;
		return b;
	}
	
	//小于等于号测试  <=
	public boolean test4(int x , int y) {
		boolean b = x<=y;
		return b;
	}
	
	//等于号测试  ==
	public boolean test5(int i, int j) {
		boolean b = i==j;
		return b;
	}
	
}
