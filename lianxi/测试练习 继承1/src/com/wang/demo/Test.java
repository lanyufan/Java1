package com.wang.demo;

import com.wang.demo.test1.Person;
import com.wang.demo.test1.Person1;
import com.wang.demo.test1.Student;


/**
 * 研究继承
 * 
 */
public class Test {
	
	public static void main(String[] args) {
		//
//		Person p1 = new Person("zhang", 30);
//		Person p2 = new Person("zhao", 40);
//		int a = p1.age;
//		String s = p1.name;
		
		Student s1 = new Student("zhang1", 20);
//		System.out.println(s1.name);
//		s1.eat();
//		s1.study();
		
		//出包了,也访问不到
		Person1 p1 = new Person1("zhang", 20);
//		System.out.println(p1.name);
//		p1.eat();
		
//		Teacher t1 = new Teacher("zhao", 30);
////		System.out.println(t1.name);
////		t1.eat();
//		t1.teach();
		
	}
}










