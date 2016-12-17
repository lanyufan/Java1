package com.wang.thread;

/**
 * 线程调度。
 *
 */
public class Demo3 {

	/**
	 * 线程休眠。 单线程休眠。
	 */
	public void myThread1() {
		// 任务
		MyTask1 task1 = new MyTask1();
		MyTask2 task2 = new MyTask2();
		// 调用
		task1.run();
		task2.run();
	}

	/**
	 * 线程休眠。 多线程切换。
	 */
	public void myThread2() {
		// 任务
		MyTask1 task1 = new MyTask1();
		MyTask2 task2 = new MyTask2();

		// 线程
		Thread th1 = new Thread(task1, "aaa");
		Thread th2 = new Thread(task2, "bbb");

		// 运行
		th1.start();
		th2.start();
	}

	/**
	 * 线程让步。
	 */
	public void myThread3() {
		// 任务
		MyTask3 target1 = new MyTask3();
		MyTask3 target2 = new MyTask3();

		// 线程
		Thread th1 = new Thread(target1, "aaa");
		Thread th2 = new Thread(target2, "bbb");

		// 运行
		th1.start();
		th2.start();
	}

	/**
	 * 线程插队。
	 */
	public void myThread4() {
		// 任务
		MyTask2 task = new MyTask2();
		// 线程
		Thread th = new Thread(task, "a");
		// 运行
		th.start();

		// 插队
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "线程，i=" + i);
			if (i == 4) {
				System.out.println(name + "线程，让线程插队,i=" + 4);
				try {
					th.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}

class MyTask1 implements Runnable {

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		for (int i = 0; i < 10; i++) {

			System.out.println(name + "线程，i=" + i);

			if (i == 4) {
				System.out.println(name + "线程休眠");
				try {
					Thread.sleep(3 * 1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class MyTask2 implements Runnable {

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		for (int j = 0; j < 10; j++) {
			System.out.println(name + "线程，j=" + j);
		}
	}
}

class MyTask3 implements Runnable {

	@Override
	public void run() {

		String name = Thread.currentThread().getName();

		for (int k = 0; k < 10; k++) {
			System.out.println(name + "线程，k=" + k);
			if (k == 3) {
				System.out.println(name + "线程，作出让步 k=" + k);
				Thread.yield();

				System.out.println(name + "线程，让步之后代码");
			}
		}
	}
}
