package com.wang.thread;

/**
 * 线程同步。
 *
 */
public class Demo1 {

	/**
	 * 线程不同步，可能发生逻辑错误。不符合现实要求。
	 * 
	 */
	public void myThread1() {
		// 任务
		MyTask1 task = new MyTask1();
		// 线程
		Thread th1 = new Thread(task, "a");
		Thread th2 = new Thread(task, "b");
		Thread th3 = new Thread(task, "c");
		Thread th4 = new Thread(task, "d");
		// 运行
		th1.start();
		th2.start();
		th3.start();
		th4.start();

		/*
		 * 线程安全问题，产生的原因是多个线程同时操作同一资源。
		 */
	}

	public void myThread2() {
		// 任务
		MyTask2 task = new MyTask2();
		// 线程
		Thread th1 = new Thread(task, "a");
		Thread th2 = new Thread(task, "b");
		Thread th3 = new Thread(task, "c");
		Thread th4 = new Thread(task, "d");
		// 运行
		th1.start();
		th2.start();
		th3.start();
		th4.start();

		/*
		 * 线程安全问题，产生的原因是多个线程同时操作同一资源 导致逻辑错乱。
		 * 
		 * 解决方案1：从资源下手。
		 * 
		 */
	}
	
	public void myThread3() {
		// 任务
		MyTask3 task = new MyTask3();
		// 线程
		Thread th1 = new Thread(task, "a");
		Thread th2 = new Thread(task, "b");
		Thread th3 = new Thread(task, "c");
		Thread th4 = new Thread(task, "d");
		// 运行
		th1.start();
		th2.start();
		th3.start();
		th4.start();

		/*
		 * 线程安全问题，产生的原因是多个线程同时操作同一资源 导致逻辑错乱。
		 * 
		 * 解决方案1：从资源下手。
		 * 
		 */
	}

}
