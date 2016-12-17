package com.wang.demo.test1;



public class Demo1 {
	
	public void test1(){
		//装箱
		int a1 = 3;
		Integer a2 = new Integer(3); 
		Integer a3 = Integer.valueOf(3); 
		
		//拆箱
		int a4 = a2.intValue();
		
		//自动装箱
		Integer a5 = 3;
		Integer a6 = 3 + a1;
		
		//自动拆箱
		int a7 = a2 + 3;
		int a8 = a2 + a3;
	}
	
	

}












