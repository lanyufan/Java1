package com.wang.thread;

public class MyInTask1 implements Runnable {

	private MyData1 data;

	private int num = 1;

	public MyInTask1(MyData1 data) {
		this.data = data;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			data.in(num);
			num++;
		}
	}
}
