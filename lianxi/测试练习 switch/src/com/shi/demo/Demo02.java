package com.shi.demo;

public class Demo02 {

	// for—≠ª∑”Ôæ‰
	public void testFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("j = " + j);
			}
		}
	}

	public void test(){
		for (int i = 5; i > 0; i--) {
			for (int j = i; j < 5; j++) {
				System.out.print(" ");
			}
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			for (int k = i-1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
}
