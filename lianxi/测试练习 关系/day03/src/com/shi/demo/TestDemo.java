package com.shi.demo;

public class TestDemo {

	public static void main(String[] args) {
		
		Cal cal = new Cal();
		
		//��ֵ���Ų���
		int y = cal.equ(20);
		System.out.println(y);
		
		int i = cal.equ1(15);
		System.out.println(i);
		
		
		//�Լӡ��Լ�����
		System.out.println(cal.add(9));;
		
		System.out.println(cal.add1(10));
		
		
		//�������������
		int sum = cal.sum(1, 2, 3, 4);
		System.out.println("�ӷ�����������"+sum);
		
		int sub = cal.sub(7, 10);
		System.out.println("��������������"+sub);
		
		int mul = cal.mul(9, 1024);
		System.out.println("�˷�����������"+mul);
		/*
		 * Test��Ĳ��Կ�
		Test test = new Test();
		test.test();	
		
		test.test1(0, 0);
		test.test2('a', "name");
		
		test.test3();
		*/
	}
	
}
