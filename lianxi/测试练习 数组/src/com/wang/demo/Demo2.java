package com.wang.demo;

/**
 * ��Demo2�� ����++��--����� ��1�����÷� ��2������ǰ�� ��3�����ں���
 * 
 */
public class Demo2 {

	/**
	 * �򵥲���
	 */
	public void myTest1() {
		// ++
		// ����
		int a = 20;
		// ����
		a++;
		// ���
		System.out.println("a++:" + a);
		// --
		// ����
		int b = 30;
		// ����
		b--;
		// ���
		System.out.println("b--:" + b);
	}

	/**
	 * ����
	 */
	public void myTest2() {
		//����
		int a = 10;
		int b = 0;
		//����
		b = a++;
		//���
//		System.out.println("a++:" + a++);
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		/*
		 * ++�ź��棬��ִ�д��룬�ٽ����������㡣
		 * 
		 */
	}

	/**
	 * ǰ��
	 */
	public void myTest3() {
		//����
		int a = 1;
		int b = 5;
		
		//����
//		b = ++a;
		
		int c = b+++a;
		
		//���
//		System.out.println(++a + "++a:");
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		System.out.println("c:" + c);
	}
	
	/**
	 * ++ -- �Ƿ�������С����
	 */
	public void myTest4(){
		double a = 3.5;
		
		a++;
		
		System.out.println("a++:" + a);
	}
	
	/**
	 * ?;���ԡ�
	 * ��1�����÷�
	 * ��2����������
	 * ��3��Ƕ��
	 */
	public void myTest5(){
		//�÷�
		int a = 80;
		int b = 90;
		
		int max = a > b ? a : b;
		System.out.println("max:" + max);
		
		//��ͬ����
		int c = 50;
		
		boolean pass = c >= 60 ? true : false;
		System.out.println("pass:" + pass);
		
		//Ƕ��
		int x = 40;
		
		char level = x >= 80 ? 'A' : (x >= 60 ? 'B' : 'C');
		System.out.println("level:" + level);
	}
	
}















