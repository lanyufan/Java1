package com.wang.thread;

public class MyWork implements Runnable{
	
	private int tikets = 100;

	public void sell() {
		// 线程名字
		String name = Thread.currentThread().getName();
		// 售票
		System.out.println(name + "线程售票：" + tikets--);
	}

	@Override
	public void run() {

		while (true) {
			
			if (tikets <= 0) {
				break;
			}
			
			sell();
		}
	}
}
