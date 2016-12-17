package com.wang.thread;

public class MyInTask2 implements Runnable {

	private MyData2 data;

	private int num = 1;

	public MyInTask2(MyData2 data) {
		this.data = data;
	}

	@Override
	public void run() {

		for (int i = 0; i < 20; i++) {
			
			in();
			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	
	public synchronized void in(){
		data.in(num);
		num++;
	}
}
