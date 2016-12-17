package com.wang.demo.test1;

public class MyTest {

	public static void main(String[] args) {
		// 
//		Person p1 = new Person("zhang", 30);
//		Person p2 = new Person("zhao", 40);
//		int a = p1.age;
//		String s = p1.name;
		
//		Student s1 = new Student("zhang1", 20);
//		System.out.println(s1.name);
//		s1.eat();
//		s1.sleep();
//		s1.study();
		
		//同包当中，测试默认和protected
		Person p1 = new Person("zhang", 20);
		//默认修饰符，包内完全可用
		System.out.println(p1.name);
		p1.eat();
		
		//受保护,包内完全可用
		Person1 p2 = new Person1("zhao", 30);
		System.out.println(p2.name);
		p2.eat();
		

	}

}
