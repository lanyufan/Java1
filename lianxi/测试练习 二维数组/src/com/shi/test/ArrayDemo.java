package com.shi.test;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] nums = new int[10];
		nums[0]=1;
		nums[2]=3;
		nums[3]=5;
		nums[4]=6;
		nums[1]=22;
		nums[5]=5;
		nums[7]=2;
		ArrayDemo arrayDemo = new ArrayDemo();
		arrayDemo.printArray(nums);
		
	}
	
	public void printArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.print(j);
		}
		
	}
}
