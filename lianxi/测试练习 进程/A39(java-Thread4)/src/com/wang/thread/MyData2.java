package com.wang.thread;

public class MyData2 {

	private int[] data = new int[10];
	private int IndexIn = 0, IndexOut = 0;
	private int count = 0;

	public synchronized void in(int num) {

		try {

			if (count == data.length) {
				this.wait();
			}
//			while (count == data.length) {
//				this.wait();
//			}

			data[IndexIn] = num;
			String name = Thread.currentThread().getName();
			System.out.println(name + "-存入data[" + IndexIn + "]：" + num);
			
			IndexIn++;
			if (IndexIn == data.length) {
				IndexIn = 0;
			}
			count++;

			this.notify();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public synchronized void out() {

		try {
			
			if (count == 0) {
				this.wait();
			}
			
//			while (count == 0) {
//				this.wait();
//			}

			int num = data[IndexOut];
			String name = Thread.currentThread().getName();
			System.out.println(name + "-取出data[" + IndexOut + "]：--" + num);

			IndexOut++;
			if (IndexOut == data.length) {
				IndexOut = 0;
			}
			count--;
			
			this.notify();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
