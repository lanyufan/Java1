package com.wang.oop.demo1;


/**
 * 外部类。（普通类）
 *
 */
public class Outter {
	
	//属性
	private String name1;
	
	private int count = 100;

	//构造
	public Outter(String name) {
		this.name1 = name;
	}
	
	//方法
	@Override
	public String toString() {
		return "name1:" + name1;
	}
	
	public void test1(){
		System.out.println("this is Outter class");
	}
	
	public void test3(){
		count++;
		System.out.println("count:" + count);
	}
	
	public class Inner{
		
		//属性
		private String name2="";
		
		private int count = 10;
		
		//构造
		public Inner(String name2) {
			this.name2 = name2;
		}
		
		//方法
		@Override
		public String toString() {
			return "name2:" + name2;
		}
		
		public void test2(){
			System.out.println("this is inner class");
		}
		
		public void test3(){
			count++;
			System.out.println("count:" + count);
		}
	}
}








