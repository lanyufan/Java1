package com.wang.demo.test3;

/**
 * Java中的异常
 * 
 */
public class Demo3 {
	
	private String name = "hello";
	
	public void test1(){
		System.out.println("name:" + name);
		name = null;
	}
	
	public void test2(){
		
		System.out.println("length:" + name.length());
		
	}
	
	public void test3(){
		
		try {
			//试试
			System.out.println(name);
			System.out.println("length:" + name.length());
			
		} catch (Exception e) {
			//如果有问题，就拿到异常对象
			System.out.println("异常了");
			e.printStackTrace();
		}
	}
	
	public void test4() throws Exception{
		
		System.out.println(name);
		System.out.println("length:" + name.length());
	}
	
	public void test5(){
		
		int[] arr = {1,2,3,4,5};
		System.out.println("len:" + arr.length);
		System.out.println("5:" + arr[5]);
	}
	
	public void test6(){
		int a = 10;
		int b = 0;
		System.out.println("div:" + (a / b));
	}
	

}









