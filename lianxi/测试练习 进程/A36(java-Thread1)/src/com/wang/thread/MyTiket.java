package com.wang.thread;

public class MyTiket {
	
	private int tikets = 100;
	
	public void sell(){
		
		if (tikets > 0 ) {
			//线程名字
			String name = Thread.currentThread().getName();
			
			System.out.println(name + "线程售票：" + tikets--);
		}
	}
}
