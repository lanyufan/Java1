package com.wang.demo;

import java.util.Arrays;

/**
 * 研究数组。 （1）格式。（定义，赋值，取值） （2）长度。 （3）类型。 （4）运算 （5）下标。
 *
 */
public class Demo4 {

	// Array

	public void myArr1() {
		// 定义 赋值
		int a = 1;
		int[] arr = { 1, 2, 3, 4, 5 };
		// 取值
		System.out.println("a:" + a);
		System.out.println("arr[0]:" + arr[0]);
		System.out.println("arr[1]:" + arr[1]);
		System.out.println("arr[2]:" + arr[2]);
		System.out.println("arr[3]:" + arr[3]);
		System.out.println("arr[4]:" + arr[4]);
		// System.out.println("arr[5]:" + arr[5]);
		// 输出
	}

	public void myArr2() {
		// 定义
		int[] arr = new int[5];
		// int[] arr2 = new int[];

		System.out.println("arr:" + arr);
		System.out.println("arr:" + Arrays.toString(arr));

		// 赋值
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println("arr:" + Arrays.toString(arr));

		// 取值
		int a = arr[4];
		System.out.println("arr[4]:" + a);

		// 长度
		System.out.println("len:" + arr.length);
	}

	/**
	 * 类型
	 */
	public void myArr3() {
		// 定义
		int arr1[] = new int[5];
		double arr2[] = new double[5];
		char arr3[] = new char[5];
		boolean arr4[] = new boolean[5];
		String arr5[] = new String[5];

		System.out.println("arr1:" + Arrays.toString(arr1));
		System.out.println("arr2:" + Arrays.toString(arr2));
		System.out.println("arr3:" + Arrays.toString(arr3));
		System.out.println("arr4:" + Arrays.toString(arr4));
		System.out.println("arr5:" + Arrays.toString(arr5));

		// 赋值
		arr1[0] = 100;
		arr2[0] = 3.14;
		arr3[0] = 'A';
		arr4[0] = true;
		arr5[0] = "hello";

		printArr(arr1);
		printArr(arr2);
		// System.out.println("arr1:" + Arrays.toString(arr1));
		System.out.println("arr2:" + Arrays.toString(arr2));
		System.out.println("arr3:" + Arrays.toString(arr3));
		System.out.println("arr4:" + Arrays.toString(arr4));
		System.out.println("arr5:" + Arrays.toString(arr5));
	}

	public void myArr4() {
		// 定义
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[5];

		System.out.println("arr1:" + Arrays.toString(arr1));
		System.out.println("arr2:" + Arrays.toString(arr2));
		
		// 运算
		arr1[0] += 1;
		arr2[0]++;
		
		// 输出
		System.out.println("arr1:" + Arrays.toString(arr1));
		System.out.println("arr2:" + Arrays.toString(arr2));
		
	}

	public void printArr(int[] arr) {
		System.out.println("arr1:" + Arrays.toString(arr));
	}

	public void printArr(double[] arr) {
		System.out.println("arr1:" + Arrays.toString(arr));
	}

}
