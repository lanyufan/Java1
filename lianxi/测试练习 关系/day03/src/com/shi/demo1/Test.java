package com.shi.demo1;

public class Test {

	public static void main(String[] args) {

		//���Թ�ϵ�����
		//����Contact��Ķ���
		Contact contact = new Contact();
		//ʹ�ö���ȥ����test1();
		boolean b1 = contact.test1();
		//���b1
		System.out.println(b1);
		
		//����test2();
		boolean b2 = contact.test2();
		System.out.println(b2);
		
		//����test3();
		boolean b3 = contact.test3(7, 6);
		System.out.println(b3);
		
		//����test4();
		boolean b4 = contact.test4(3, 4);
		System.out.println(b4);
		
		//����test5();
		boolean b5 = contact.test5(4,5);
		System.out.println(b5);
	}

}
