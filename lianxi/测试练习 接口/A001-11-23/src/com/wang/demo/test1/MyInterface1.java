package com.wang.demo.test1;

public interface MyInterface1 {
	
	//属性
//	private String name = "";
	/*
	 *接口中不能定义private属性
	 */
	public String name = "";
//	public static String name1="";
	/*
	 * 接口中，定义的属性，默认是static的
	 */
	
	String name1 = "aaa";
	public static final String name2 = "bbb";
	
	//构造
//	public MyInterface1(){
//		
//	}
	/*
	 * 接口中不能定义构造方法
	 */
	
	//方法
//	public void test1(){
//		
//	}
	/*
	 * 接口不能定义普通方法
	 */
	public abstract void test1();
//	private abstract void test2();
	/*
	 * 接口中不能定义private方法
	 */
	
//	public final void test2();

}




