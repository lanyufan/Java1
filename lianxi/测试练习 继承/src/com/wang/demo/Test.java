package com.wang.demo;

import com.wang.demo.extends1.Baby;
import com.wang.demo.extends1.Family;
import com.wang.demo.extends1.Father;
import com.wang.demo.extends1.Grandma;
import com.wang.demo.extends1.Grandpa;
import com.wang.demo.extends1.Member;
import com.wang.demo.extends1.Mother;
import com.wang.demo.obj.Student;


/**
 * 研究继承
 * 
 */
public class Test {
	
	public static void main(String[] args) {
		//测试
//		A a = new A(5);
////		a.add();
////		a.sub();
//		
//		B b = new B(10);
////		b.sub();
////		b.add();
//		
//		C c = new C();
//		c.add();
//		c.sub();
//		c.mul();
		
//		Father f = new Father("父亲", 50);
//		f.getup();
//		f.work();
//		f.play();
//		f.sleep();
//		Grandpa grandpa = new Grandpa("爷爷", 77,Member.ROLE_GRANDPA);
//		Grandma grandma = new Grandma("奶奶", 80,Member.ROLE_GRANDMA);
//		Father father = new Father("爸爸", 45,Member.ROLE_FATHER);
//		Mother mother = new Mother("妈妈", 25,Member.ROLE_MOTHER);
//		Baby baby = new Baby("baby", 26,Member.ROLE_BABY);
//		Family f = new Family(grandpa, grandma, father, mother, baby);
//		f.day();
		
		AA aa = new AA();
//		aa.add();
//		aa.sub();
		
		BB bb = new BB();
//		bb.mul();
//		bb.div();
		
//		System.out.println("a1:" + bb.a1);
//		System.out.println("a2:" + bb.a2);
//		System.out.println("b1:" + bb.b1);
//		System.out.println("b2:" + bb.b2);
//		bb.add();
//		bb.sub();
//		bb.mul();
//		bb.div();
		
//		bb.test1();
//		bb.test2();
		
//		Object obj = new Object();
//		//Java放射机制
//		obj.getClass();
//		//对象变字符串
//		obj.toString();
//		//对象比较
//		obj.equals(obj);
//		//对象的hashcode码
//		obj.hashCode();
		
		//Java多线程
//		obj.notify();
//		obj.notifyAll();
//		obj.wait();
//		obj.wait(timeout);
		
		
//		Student s1 = new Student();
//		Student s2 = new Student();
//		Student s3 = s1;
		
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
//		System.out.println(s3.toString());
//		System.out.println(s1.equals(s3));
		
//		Student s1 = new Student("zhang", 20);
//		Student s2 = new Student("zhao", 30);
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.equals(o2));
		
		
		String s1 = "aaa";
		String s2 = "bbb";
		
		System.out.println(s1.equals(s2));
	}
}










