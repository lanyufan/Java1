package com.wang.demo;

/**
 * 函数格式。
 * （1）基本格式，头（修饰符，返回值，名字，参数），体。
 * （2）无参
 * （3）有参
 * （4）无返回值
 * （5）有返回值 
 *
 */
public class Demo3 {
	
	
	public void test(){
		System.out.println("hello");
	}
	
	/**
	 * 加法运算。
	 */
	public void myTest1(){
		int a = 2;
		int b = 3;
		int c = a + b;
		System.out.println("c=" + c);
	}
	
	public void myTest2(int a, int b){
		int c = a + b;
		System.out.println("c=" + c);
	}
	
	public int myTest3(int a, int b){
		int c = a + b;
		System.out.println("int");
		return c;
	}
	
	public double myTest3(double a,double b){
		
		return a + b;
	}
	
	public int myTest3(float a,float b){
		System.out.println("float");
		return (int)(a + b);
	}
	
	public int i = 0;
	public void myTest4(){
		i++;
		System.out.println("i=" + i);
		
		if ( i >= 100) {
			return;
		}
		
		myTest4();
	}
	

}









