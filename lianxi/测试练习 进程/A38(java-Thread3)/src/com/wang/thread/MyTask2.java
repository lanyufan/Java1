package com.wang.thread;


public class MyTask2 implements Runnable {

	private int tikets = 10;

	private Object lock = new Object();

	@Override
	public void run() {

		while (true) {

			synchronized (lock) {
				
				if (tikets > 0) {

					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					String name = Thread.currentThread().getName();
					System.out.println(name + "线程--售票：" + tikets--);
				} else {
					break;
				}
			}
		}
	}
}
