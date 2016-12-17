package com.wang.demo;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

/**
 * 类的格式。
 * 
 * （1）数据（变量） （2）处理（函数）
 *
 */
public class Demo1 {

	// 数据(定义)
	int a = 10;
	int b = 20;

	// 处理
	void add(){
		int c = 0;
		c = a + b;
//		System.out.println("c=" + c);
		System.out.println(a + "+" + b + "=" + c);
	}

}
