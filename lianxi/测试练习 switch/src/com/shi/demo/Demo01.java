package com.shi.demo;

public class Demo01 {

	// 条件为String型
	public void testString(String str) {
		switch (str) {
		case "张三":
			System.out.println("我叫张三");
			break;
		case "李四":
			System.out.println("我叫李四");
			break;
		case "王宝强":
			System.out.println("我叫王宝强");
			break;
		default:
			System.out.println("这是其余人");
			break;
		}
	}

	// 判断条件为字符型char
	public void testChar(char c) {
		switch (c) {
		case 'a':
			System.out.println("传入的判断条件为a的情况");
			break;
		case 'd':
			System.out.println("传入的判断条件为d的情况");
			break;
		case 'b':
			System.out.println("传入的判断条件为b的情况");
			break;
		case 'c':
			System.out.println("传入的判断条件为c的情况");
			break;
		default:
			System.out.println("传入的判断条件为其他的情况");
			break;
		}

	}

	// 判断条件为整形数据
	public void testInt(int x) {
		switch (x) {
		case 1:
			System.out.println("这是第一种情况");
			break;
		case 2:
			System.out.println("这是第二种情况");
			break;
		case 3:
			System.out.println("这是第三种情况");
			break;
		case 4:
			System.out.println("这是第四种情况");
			break;
		default:
			System.out.println("这是其余的情况");
			break;
		}
	}
}
