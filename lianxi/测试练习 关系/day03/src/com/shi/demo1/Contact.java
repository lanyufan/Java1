package com.shi.demo1;

public class Contact {

	//���ڱ�ʾ��ϵ���������� boolean  true  false
	
	boolean b1 = true;
	boolean b2 = false;
	
	//���ںŲ���
	public boolean test1() {
		b1 = 1>2;
		return b1;
	}
	
	//С�ںŲ���
	public boolean test2() {
		b2 = 1<2;
		return b2;
	}
	
	//���ڵ��ںŲ���  >=
	public boolean test3(int x , int y) {
		boolean b = x>=y;
		return b;
	}
	
	//С�ڵ��ںŲ���  <=
	public boolean test4(int x , int y) {
		boolean b = x<=y;
		return b;
	}
	
	//���ںŲ���  ==
	public boolean test5(int i, int j) {
		boolean b = i==j;
		return b;
	}
	
}
