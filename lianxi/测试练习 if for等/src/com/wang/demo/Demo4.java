package com.wang.demo;

import java.util.Scanner;

/**
 * for
 */
public class Demo4 {
	
	public void test1(){
		for (int i = 0; i < 10; i++) {
			System.out.println("i=" + i);
		}
	}
	
	public void test2(){
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("i=" + i + " j=" + j);
			}
		}
	}
	
	public void test3(){
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				
				int res = i * j;
				
				System.out.print(i + "*" + j + "=" + res + " ");
				
				if (res < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public void test4(){
		
//		Scanner scanner = new Scanner(System.in);
//		int i = scanner.nextInt();
		
		int i = 10;
		while (i > 10) {
			i--;
			System.out.println("i=" + i);
			
//			if (i <= 0) {
//				break;
//			}
		}
		
//		scanner.close();
	}
	
	public void test5(){
		int i = 10;
		do {
			i--;
			System.out.println("i=" + i);
		} while (i > 10);
	}
	

}
