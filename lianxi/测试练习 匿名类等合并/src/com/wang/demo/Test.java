package com.wang.demo;

import com.wang.demo.test1.Anim;
import com.wang.demo.test1.Computer;
import com.wang.demo.test1.Dog1;
import com.wang.demo.test1.Mobile;
import com.wang.demo.test1.USB;
import com.wang.demo.test2.Dog;
import com.wang.demo.test2.Student;
import com.wang.demo.test2.StudentHoliday;
import com.wang.demo.test3.Outer1;
import com.wang.demo.test3.Outer1.Inner1;
import com.wang.demo.test3.Outer2;
import com.wang.demo.test3.Outer2.Inner2;
import com.wang.demo.test3.Outer3;
import com.wang.demo.test3.Outer3.Inner3;
import com.wang.demo.test4.Car;
import com.wang.demo.test4.Teacher;
import com.wang.demo.test5.Outer5;
import com.wang.demo.test5.Outer6;
import com.wang.demo.test5.Outer5.Inner5;
import com.wang.demo.test5.Outer6.Inner6;



/**
 * 研究抽象类，接口
 * 
 */
public class Test {
	
	
	public static void main(String[] args) {
		
		/*
		 * 抽象类，只能声明变量，不能new对象
		 */
//		Anim a1 = new Anim("动物");
		
//		Dog1 d = new Dog1("狗类");
//		d.eat();
//		d.sleep();
		
		/*
		 * 抽象类，
		 * 可以声明变量。
		 * 把抽象类的实现过程和new对象合二为一。
		 * 子类没有名字了。产生了匿名类。
		 * 
		 */
//		Anim a2 = new Anim("地包天") {
//			
//			@Override
//			public void sleep() {
//				System.out.println(getName() + ",躺着睡");
//			}
//			
//			@Override
//			public void eat() {
//				System.out.println(getName() + ",吃不动骨头");
//			}
//		};
//		a2.eat();
//		a2.sleep();
		
//		USB usb = new USB();
//		Computer c = new Computer();
//		c.in();
//		c.out();
		
//		USB usb = new USB() {
//			
//			@Override
//			public void out() {
//				System.out.println("手机输出数据");
//			}
//			
//			@Override
//			public void in() {
//				System.out.println("手机输入数据");
//			}
//		};
//		
//		usb.in();
//		usb.out();
		
//		Mobile m = new Mobile();
//		Mobile m2 = new Mobile(){
//			
//			@Override
//			public void test() {
//				System.out.println("this is iphone");
//			}
//		};
//		m2.test();
		
		Student s  = new Student("zhangsan");
//		Dog d = new Dog("旺财");
//		StudentHoliday h = new StudentHoliday();
//		s.setAnim(d);
//		s.setHoliday(h);
		
//		s.intro();
		
//		Inner1 inner = new Outer1("aaa").new Inner1("bbb");
//		inner.in();
		
//		Inner2 inner = new Outer2("aaa").new Inner2("bbb") {
//			
//			@Override
//			public void in() {
//				System.out.println("b:" + getB());
//			}
//		};
////		inner.in();
//		inner.in1();
		
//		Inner3 inner1 = new Outer3("aaa").new Inner3() {
//			
//			@Override
//			public void in() {
//				
//			}
//		};
		
		Inner3 inner2 = new Inner3() {
			
			@Override
			public void in() {
				System.out.println("b:" + b);
			}
		};
		
//		inner2.in();
		
//		String s1 = Car.aaa;
//		String s2 = Teacher.aaa;
//		String s3 = Car.course;
		
//		Inner5 in5 = new Outer5("aaa") {
//
//			@Override
//			public void out() {
//				System.out.println("hello");
//			}
//		}.new Inner5("bbb");
//		
//		in5.in();
		
//		Inner6 in = new Outer6() {
//			
//			@Override
//			public void out() {
//				System.out.println("world");
//				
//			}
//		}.new Inner6("bbb");
		
		Inner6 in6 = new Outer6.Inner6("bbb");
		in6.in();
	}
}



















