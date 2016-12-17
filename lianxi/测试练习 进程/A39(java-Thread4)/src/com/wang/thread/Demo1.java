package com.wang.thread;

/**
 * 线程通信。
 *
 */
public class Demo1 {

	public void myThread1() {
		// 数据
		MyData1 data = new MyData1();
		// 任务
		MyInTask1 task1 = new MyInTask1(data);
		MyOutTask1 task2 = new MyOutTask1(data);
		// 线程
		Thread th1 = new Thread(task1, "a");
		Thread th2 = new Thread(task2, "b");
		// 运行
		th1.start();
		th2.start();

	}

	public void myThread2() {
		// 数据
		MyData2 data = new MyData2();
		// 任务
		MyInTask2 task1 = new MyInTask2(data);
		MyOutTask2 task2 = new MyOutTask2(data);
		// 线程
		Thread th1 = new Thread(task1, "a");
		Thread th11 = new Thread(task1, "aa");
		Thread th2 = new Thread(task2, "b");
		Thread th22 = new Thread(task2, "bb");
		// 运行
		th1.start();
		th11.start();
		th2.start();
		th22.start();

	}

	public void myThread3() {

	}

}
