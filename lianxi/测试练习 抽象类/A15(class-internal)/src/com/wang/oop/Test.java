package com.wang.oop;

import com.wang.oop.demo1.Outter;
import com.wang.oop.demo1.Out.In;
import com.wang.oop.demo1.Outter.Inner;
import com.wang.oop.demo2.Bank;
import com.wang.oop.demo2.Bank.Boy;
import com.wang.oop.demo2.Bank.Girl;


public class Test {

	public static void main(String[] args) {
		
		//外部类
		Outter out = new Outter("aaa");
//		System.out.println(out);
//		out.test1();
//		
		//内部类
//		Inner in = new Inner();
		Inner in = out.new Inner("bbb");
//		System.out.println(in);
//		in.test2();
		/*
		 * 内部类如何实例化？
		 * （1）必须先有外部类的对象。
		 * （2）通过外部类的对象new内部类的对象。
		 * 特性：
		 * （1）内部类可以访问外部类的属性，方法
		 * （2）内部类属性，方法与外部类的属性，方法重名，内部类覆盖外部类
		 * 
		 */
		
//		in.test3();
		
		//测试静态内部类
//		In b = new In();
//		Out.In in = new Out.In();
//		in.testB1();
		
		//银行案例
		Bank bank = new Bank("ICBC", 10000);
//		bank.show();
//		bank.in(50);
//		bank.out(200);
		Boy boy1 = bank.new Boy("男1号");
		Boy boy2 = bank.new Boy("男2号");
		
		Girl girl1 = bank.new Girl("女1号");
		Girl girl2 = bank.new Girl("女2号");
		
		bank.show();
		
		boy1.outMoney(100);
		boy2.outMoney(200);
		girl1.inMoney(500);
		girl2.inMoney(200);
		
		bank.show();
	}
}












