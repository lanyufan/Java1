package com.shi.test;

import java.util.Arrays;

public class Test {

	 /*
	 * 数组：存放同一种数据类型的容器；
	 * 数据类型 【】 数组名称 = new 数据类型【数组长度】;
	 * 数据类型  数组名称【】 = new 数据类型【数组长度】;
	 * 数据类型【】  数组名称 = new 数据类型【】{元素内容，，，};
	 * 数据类型【】  数组名称 = {元素内容，，，};
	 */
	
	
	public static void main(String[] args) {
		
//		String[] arrayString = new String[10];
//		int arraydemo1[] = new int[10];
//		int arraydemo2[] = new int[]{1,3,4,5,6,5};
//		int arraydemo3[] = {1,3,4,5,6,5};
		
		int[] arraydemo = {1,3,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5,4,5,6,5};
		
		
//		System.out.println(arraydemo.length);
		for (int i = 0; i < arraydemo.length; i++) {
			int j = arraydemo[i];
			System.out.println(j);
		}
		
		
		
		
		
		
//		arraydemo[0] = 10;
//		arraydemo[9] = 9;
//		System.out.println(arraydemo[0]);
//		System.out.println(arraydemo[9]);
		
		
		
	}
	
}
