package com.shi.test;

public class ArrayDemo1 {
	/*
	 * 二维数组：
	 * 数据类型[][] 数组名 = new 数据类型[2][2];
	 * 数据类型[][] 数组名 = new 数据类型[2][];
	 * 数据类型[][] 数组名 = new 数据类型{{},{},{},{}};
	 * 数据类型[][] 数组名 = {{},{},{},{}};
	 */
	public static void main(String[] args) {
		int[][] array = new int[2][3];
		
		array[0][0]= 1;
		array[0][1]= 3;
		array[0][2]= 4;
		array[1][0]= 5;
		array[1][1]= 6;
		array[1][2]= 7;
		for(int i=0;i<array.length;i++){
			System.out.println(array.length);
			for (int j = 0; j <array[i].length ; j++) {
				System.out.println(array[i].length);
				System.out.println(array[i][j]);
			}
			
		}
		
	}
	
}
