package com.wang.thread;

public class MyOutTask1 implements Runnable {

	private MyData1 data;

	public MyOutTask1(MyData1 data) {
		this.data = data;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			data.out();
		}
	}

}
