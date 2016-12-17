package com.wang.thread;


/**
 * 继承Thread类。 
 *
 */
public class Demo3 extends Thread {

	@Override
	public void run() {
		super.run();
		
		int count = 100;
		int i = 0;
		while (i < count) {
			//当前线程名字
			String name = Thread.currentThread().getName();
			
			System.out.println(name + "线程:i=" + i);
			i++;
		}
	}
	
	/*
	 *  通过Thread类实现多线程。缺点：
	 *  （1）Java是单继承，实现类继承Thread类，就无法继承其他类。
	 *  （2）任务代码和线程类交织在一起，不符合OOP基本思想。
	 */
}


