package com.shi.demo;

public class Demo02 {
	
	//���̿������
	/*
	 * if(  ){
	 * 
	 * }
	 */
	
	//if���
	public void testIf() {
		if (true) {
			System.out.println("�ж�������ȷ���������");
		}
		System.out.println("������ȷ����֮�⣬���������");
	}
	
	//elseif���
	
	public void testElseIf(){
		int x = 2;
		int y = 5;
		double d = 12.3;
		if (x!=y){
			System.out.println("x����y");
		}else if (x!=d) {
			System.out.println("x����d");
		}else {
			System.out.println("�����������");
		}	
	}
	
	//if����else���
	public void testIfElse() {
		int x = 1;
		double d = 0.0;
		
		
		if (x == d) {
			System.out.println("�ж�������ȷ���������");
		}else {
			System.out.println("������ȷ����֮�⣬���������");
		}
		
	}
	
	
}
