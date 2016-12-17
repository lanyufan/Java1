package com.wang.thread;

public class MyThread2 extends Thread {

	private int tikets = 100;

	public void sell() {
		// 线程名字
		String name = Thread.currentThread().getName();
		// 售票
		System.out.println(name + "线程售票：" + tikets--);
	}

	@Override
	public void run() {
		super.run();

		while (true) {
			
			if (tikets <= 0) {
				System.out.println("票卖完了");
				break;
			}
			
			sell();
		}
	}
}
