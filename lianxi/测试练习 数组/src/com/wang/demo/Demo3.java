package com.wang.demo;

/**
 * ������ʽ��
 * ��1��������ʽ��ͷ�����η�������ֵ�����֣����������塣
 * ��2���޲�
 * ��3���в�
 * ��4���޷���ֵ
 * ��5���з���ֵ 
 *
 */
public class Demo3 {
	
	
	public void test(){
		System.out.println("hello");
	}
	
	/**
	 * �ӷ����㡣
	 */
	public void myTest1(){
		int a = 2;
		int b = 3;
		int c = a + b;
		System.out.println("c=" + c);
	}
	
	public void myTest2(int a, int b){
		int c = a + b;
		System.out.println("c=" + c);
	}
	
	public int myTest3(int a, int b){
		int c = a + b;
		System.out.println("int");
		return c;
	}
	
	public double myTest3(double a,double b){
		
		return a + b;
	}
	
	public int myTest3(float a,float b){
		System.out.println("float");
		return (int)(a + b);
	}
	
	public int i = 0;
	public void myTest4(){
		i++;
		System.out.println("i=" + i);
		
		if ( i >= 100) {
			return;
		}
		
		myTest4();
	}
	

}









