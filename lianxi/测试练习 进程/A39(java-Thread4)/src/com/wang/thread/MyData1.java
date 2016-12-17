package com.wang.thread;

public class MyData1 {

	private int[] data = new int[10];
	private int IndexIn = 0, IndexOut = 0;

	public void in(int num) {

		data[IndexIn] = num;
		System.out.println("data[" + IndexIn + "]存入：" + num);

		IndexIn++;
		if (IndexIn == data.length) {
			IndexIn = 0;
		}

	}

	public void out() {
		int num = data[IndexOut];
		System.out.println("data[" + IndexOut + "]取出：--" + num);

		IndexOut++;
		if (IndexOut == data.length) {
			IndexOut = 0;
		}
	}
}
