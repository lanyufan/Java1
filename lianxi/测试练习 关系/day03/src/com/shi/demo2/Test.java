package com.shi.demo2;

public class Test {

	public static void main(String[] args) {
		Opr opr = new Opr();
		System.out.println("---------与--------");
		opr.test1();
		System.out.println("---------或--------");
		opr.test2();
		System.out.println("---------非--------");
		opr.test3();
		System.out.println("---------异或--------");
		opr.test4();
		System.out.println("---------短路与--------");
		opr.test5();
		System.out.println("---------短路或--------");
		opr.test6();
	}

}
