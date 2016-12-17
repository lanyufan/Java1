package com.wang.thread;

/**
 * 要处理的任务。
 * 
 *
 */
public class MyTask1 implements Runnable{
	
	private int tikets = 10;

	@Override
	public void run() {
		
		while (true) {
			
			if (tikets > 0) {
				
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				String name = Thread.currentThread().getName();
				System.out.println(name + "线程--售票：" + tikets--);
			}else {
				break;
			}
		}
	}
}