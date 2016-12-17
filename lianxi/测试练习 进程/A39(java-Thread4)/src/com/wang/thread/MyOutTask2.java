package com.wang.thread;

public class MyOutTask2 implements Runnable {

	private MyData2 data;

	public MyOutTask2(MyData2 data) {
		this.data = data;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			data.out();
		}
	}

}
