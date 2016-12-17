package com.shi.demo;

public class Cal {
	
	//赋值  =   +=   -=   /=   *=   %=
	public int equ(int x){
		int y = 10;
		y = x;
		return y;		
	}
	
	public int equ1(int i){
		i += i;
		return i;
	}

	//自加
	
	public int add(int x){
		 
		return ++x;
	}
	
	public int add1(int x){
		
		return x++;
	}
	
	
	//自减
	
	
	
	// 加法
	public int sum(int x, int y, int i, int j) {
		int sum = x + y + i + j;
		return sum;
	}

	// 减法
	public int sub(int x, int y) {
		int sub = x - y;
		return sub;
	}

	// 乘法
	public int mul(int x, int y) {
		int mul = x * y;
		return mul;
	}
	
	//除法
	
	//取模
}
