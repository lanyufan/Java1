package com.wang.thread;


/**
 * 实现Runnable接口。 
 *
 */
public class Demo4 implements Runnable {

	@Override
	public void run() {
		
		int count = 100;
		int i = 0;
		while (i < count) {
			
			//获取运行这段代码的线程名字
			String name = Thread.currentThread().getName();
			System.out.println(name + "线程：i=" + i);
			
			i++;
		}
	}
	
	/*
	 *  Thread类缺点：
	 *  （1）Java是单继承，实现类继承Thread类，就无法继承其他类。
	 *  （2）任务代码和线程类交织在一起，不符合OOP基本思想。
	 */
	
	/*
	 *  Runnable接口：
	 *  （1）Runnable是接口，不影响实现类继承其他类的关系。
	 *  （2）任务代码和线程类分离，符合OOP基本思想。
	 */
}


