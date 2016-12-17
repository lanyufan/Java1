package com.shi.demo;

public class Test {

	/*
	 * 方法
	 * a.有参数的方法
	 * b.无参数的方法
	 * c.有返回值的方法
	 * 
	 */
	
	//无参数，且无返回值的方法
	public void test(){
		System.out.println("这是无参数，且无返回值的方法");
		
	}
	
	//有参数，且无返回值的方法
	public void test1(int x , double y){
		System.out.println("有参数，且无返回值的方法");
	}
	
	//有参数且有返回值类型的方法
	public String test2(char c , String str ){
		System.out.println("有参数且有返回值类型的方法");
		return str;
	}
	
	//无参数且有返回值类型的方法
	public char test3(){
		System.out.println("无参数且有返回值类型的方法");
		return 'c';
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
