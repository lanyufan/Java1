package com.wang.demo;

import java.util.function.IntBinaryOperator;

/**
 * 研究if，switch,for,while (1)格式 (2)嵌套 (3)小案例
 */
public class Demo2 {

	public void test1(int a, int b) {
		// 结果
		int c = 0;
		// 参数检查
		if (a == 0) {
			System.out.println("c=" + c);
			return;
		}

		// 运算
		if (b != 0) {
			c = a / b;
		}

		// 输出
		System.out.println("c=" + c);
	}

	public void test2(int a, int b) {
		int c = 0;

		if (b == 0) {
			System.out.println("除数不能为0");
		} else {
			c = a / b;
			System.out.println("c=" + c);
		}
	}

	public void test3(int income) {
		// 参数检查
		if (income <= 0) {
			System.out.println("参数有误");
			return;
		}

		// 结果
		String s = "xxx";

		// 运算
		if (income <= 3000) {
			s = "小市民";
		} else if (income <= 5000) {
			s = "小白领";
		} else if (income <= 8000) {
			s = "白领";
		} else if (income <= 10000) {
			s = "金领";
		} else {
			s = "土豪";
		}

		// 结果
		System.out.println("收入：" + income + ",阶层：" + s);
	}

	public void test4(int gender, int age, int height) {

		// if (gender == 1) {
		// if (age < 30) {
		// if (height >= 180) {
		// System.out.println("合格");
		// }
		// }
		// }

		if (gender == 1 && age <= 30 && height > 180) {
			System.out.println("合格");
		}
	}

	public void test5(int a, int b, int c) {
		// 参数检查
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("参数有误");
			return;
		}

		// 判断是否三角形
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("可以构成三角形");
		}

		// 判断是否直角
		if ((a*a + b*b == c*c) || (a*a + c*c == b*b) || (b*b + c*c == a*a)) {
			System.out.println("可以构成直角三角形");
		}
		// 计算周长
		double cc = a + b + c;

		// 计算面积
		double p = cc / 2;
		System.out.println("p=" + p);
		double temp = p*(p-a)*(p-b)*(p-c);
		double s = Math.sqrt(temp);

		// 输出
		System.out.println("cc=" + cc);
		System.out.println("s=" + s);

	}

}
