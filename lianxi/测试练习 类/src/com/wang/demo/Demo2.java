package com.wang.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;


public class Demo2 {
	
	public void test1(){
//		Math m = new Math();
//		Math m = Math.get();
		//属性
		System.out.println("E:" + Math.E);
		System.out.println("pi:" + Math.PI);
		
		//方法
//		System.out.println("abs:" + Math.abs(-5));
//		System.out.println("max:" + Math.max(5, 10));
//		System.out.println("min:" + Math.min(5, 10));
//		System.out.println("sqrt:" + Math.sqrt(2));
//		System.out.println("pow:" + Math.pow(2, 3));
//		System.out.println("ceil:" + Math.ceil(2.2));
//		System.out.println("floor:" + Math.floor(2.2));
//		System.out.println("round:" + Math.round(2.7));
		
		System.out.println("random:" + Math.random());
	}
	
	
	public void test2(){
//		Random r = new Random();
//		for (int i = 0; i < 10; i++) {
//			int a = r.nextInt(10);
//			System.out.println("a:" + a);
//		}
		
//		Random r = new Random(3000);
//		for (int i = 0; i < 10; i++) {
//			int a = r.nextInt(10);
//			System.out.println("a:" + a);
//		}
	}
	
	public void test3(){
//		System sys = new System();
		//标准输入流
//		System.in;
//		//标准输出流
//		System.out;
//		//标准错误流
//		System.err;
		
//		System.out.println("aaa");
//		System.err.println("bbb");
		
//		long time = System.currentTimeMillis();
//		System.out.println("time:" + time);
//		
////		String pattern = "yyyy年MM月dd日 hh:mm:ss";
////		String pattern = "yy-MM-dd";
//		String pattern = "hh:mm";
//		
//		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//		String s = sdf.format(time);
//		
//		System.out.println("time:" + s);
		
		
//		Date d = new Date();
//		System.out.println("time:" + d.getTime());

		Calendar c = Calendar.getInstance();
		
		System.out.println("day:" + c.get(Calendar.DAY_OF_WEEK));
		System.out.println("day:" + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("day:" + c.get(Calendar.DAY_OF_YEAR));
		System.out.println("month:" + c.get(Calendar.MONTH));
	}

	
}






















