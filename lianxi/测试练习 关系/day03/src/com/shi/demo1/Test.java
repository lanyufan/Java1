package com.shi.demo1;

public class Test {

	public static void main(String[] args) {

		//测试关系运算符
		//创建Contact类的对象
		Contact contact = new Contact();
		//使用对象去掉用test1();
		boolean b1 = contact.test1();
		//输出b1
		System.out.println(b1);
		
		//测试test2();
		boolean b2 = contact.test2();
		System.out.println(b2);
		
		//测试test3();
		boolean b3 = contact.test3(7, 6);
		System.out.println(b3);
		
		//测试test4();
		boolean b4 = contact.test4(3, 4);
		System.out.println(b4);
		
		//测试test5();
		boolean b5 = contact.test5(4,5);
		System.out.println(b5);
	}

}
