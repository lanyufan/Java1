package com.shi.demo;

public class Demo02 {
	
	//流程控制语句
	/*
	 * if(  ){
	 * 
	 * }
	 */
	
	//if语句
	public void testIf() {
		if (true) {
			System.out.println("判断条件正确，输出这里");
		}
		System.out.println("除了正确条件之外，都输出这里");
	}
	
	//elseif语句
	
	public void testElseIf(){
		int x = 2;
		int y = 5;
		double d = 12.3;
		if (x!=y){
			System.out.println("x等于y");
		}else if (x!=d) {
			System.out.println("x等于d");
		}else {
			System.out.println("这是其余情况");
		}	
	}
	
	//if……else语句
	public void testIfElse() {
		int x = 1;
		double d = 0.0;
		
		
		if (x == d) {
			System.out.println("判断条件正确，输出这里");
		}else {
			System.out.println("除了正确条件之外，都输出这里");
		}
		
	}
	
	
}
