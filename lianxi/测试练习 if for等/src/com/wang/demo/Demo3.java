package com.wang.demo;

/**
 * swtich
 */
public class Demo3 {

	public void test1(int i) {

		switch (i) {
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
			break;

		// default:
		// System.out.println("default");
		// break;
		}

	}

	public void test2(String s) {

		switch (s) {
		case "aaa":
			System.out.println("aaa");
			break;
		case "bbb":
			System.out.println("bbb");
			break;
		case "ccc":
			System.out.println("ccc");
			break;
		}

	}

	public void test3(int i) {

		switch (i) {
		case 1:
			System.out.println("case 1");
		case 2:
			System.out.println("case 2");
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
		case 5:
			System.out.println("case 5");
		case 6:
			System.out.println("case 6");
		}
	}

	public void test4(int year, int month) {

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31天");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30天");
			break;
		case 2:
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.println("29天");
			} else {
				System.out.println("28天");
			}
			break;
		}

	}
}
