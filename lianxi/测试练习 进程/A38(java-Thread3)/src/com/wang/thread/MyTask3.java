package com.wang.thread;

public class MyTask3 implements Runnable {

	private int tikets = 10;

	@Override
	public void run() {

		while (true) {
			
			sell();
			
			if (tikets <= 0) {
				break;
			}
		}
	}

	public synchronized void sell() {

		if (tikets > 0) {

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			String name = Thread.currentThread().getName();
			System.out.println(name + "线程--售票：" + tikets--);
		}

	}

}
