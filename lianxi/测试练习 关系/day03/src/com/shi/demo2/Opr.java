package com.shi.demo2;

public class Opr {

	boolean b1 = false;
	boolean b2 = true;
	boolean b3 = true;
	boolean b4 = false;

	// 与运算符 &
	public void test1() {
		boolean bb1 = b1 & b2;
		System.out.println("b1 & b2 = " + bb1);
		boolean bb2 = b1 & b4;
		System.out.println("b1 & b4 = " + bb2);
		boolean bb3 = b2 & b3;
		System.out.println("b2 & b3 = " + bb3);
	}

	// 或运算符 |
	public void test2() {
		boolean bb1 = b1 | b2;
		System.out.println("b1 | b2 = " + bb1);
		boolean bb2 = b1 | b4;
		System.out.println("b1 | b4 = " + bb2);
		boolean bb3 = b2 | b3;
		System.out.println("b2 | b3 = " + bb3);
	}

	// 非运算符 ！
	public void test3() {
		boolean bb1 = !b1;
		System.out.println("!b1 = " + bb1);
		boolean bb2 = !b2;
		System.out.println("!b2 = " + bb2);
	}

	// 异或运算符 ^
	public void test4() {
		boolean bb1 = b1 ^ b2;
		System.out.println("b1 ^ b2 = " + bb1);
		boolean bb2 = b3 ^ b4;
		System.out.println("b3 ^ b4 = " + bb2);
		boolean bb3 = b2 ^ b3;
		System.out.println("b2 ^ b3 = " + bb3);
		boolean bb4 = b1 ^ b4;
		System.out.println("b1 ^ b4 = " + bb4);
	}
	
	//短路与  &&
	public void test5() {
		boolean bb1 = b1 && b2;
		System.out.println("b1 && b2 = "+ bb1);
		boolean bb2 = b1 && b4;
		System.out.println("b1 && b4 = "+ bb2);
		boolean bb3 = b2 && b3;
		System.out.println("b2 && b3 = "+ bb3);
		boolean bb4 = b2 && b4;
		System.out.println("b2 && b4 = "+ bb4);
	}
	
	//短路或 ||
	public void test6() {
		boolean bb1 = b1 || b2;
		System.out.println("b1 || b2 = "+ bb1);
		boolean bb2 = b1 || b4;
		System.out.println("b1 || b4 = "+ bb2);
		boolean bb3 = b2 || b3;
		System.out.println("b2 || b3 = "+ bb3);
		boolean bb4 = b2 || b4;
		System.out.println("b2 || b4 = "+ bb4);
	}
	
}
