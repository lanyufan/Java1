package com.shi.demo;

public class Cal {
	
	//��ֵ  =   +=   -=   /=   *=   %=
	public int equ(int x){
		int y = 10;
		y = x;
		return y;		
	}
	
	public int equ1(int i){
		i += i;
		return i;
	}

	//�Լ�
	
	public int add(int x){
		 
		return ++x;
	}
	
	public int add1(int x){
		
		return x++;
	}
	
	
	//�Լ�
	
	
	
	// �ӷ�
	public int sum(int x, int y, int i, int j) {
		int sum = x + y + i + j;
		return sum;
	}

	// ����
	public int sub(int x, int y) {
		int sub = x - y;
		return sub;
	}

	// �˷�
	public int mul(int x, int y) {
		int mul = x * y;
		return mul;
	}
	
	//����
	
	//ȡģ
}
