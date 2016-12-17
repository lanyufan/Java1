package com.wang.demo;


public class Test {
	
	public static void main(String[] args) {
		
//		Student s = new Student("zhang", "male", 60, 70, 90);
//		s.intro();
//		s.total();
//		s.avg();
		
		Student s1 = new Student("zhang1", "male", 40, 20, 80);
		Student s2 = new Student("zhang2", "male", 40, 30, 70);
		Student s3 = new Student("zhang3", "male", 40, 40, 90);
		Student s4 = new Student("zhang4", "male", 40, 50, 50);
		Student s5 = new Student("zhang5", "male", 40, 60, 10);
		
//		Student[] students = new Student[5];
//		students[0] = s1;
//		students[1] = s2;
//		students[2] = s3;
//		students[3] = s4;
//		students[4] = s5;
		Student[] students = {s1,s2,s3,s4,s5};
		
		
		MyClass myClass = new MyClass("1班", "laowang", students);
//		myClass.intro();
//		myClass.total();
//		myClass.avg();
//		myClass.max();
//		myClass.min();
		myClass.sort();
		
		
	}
	
	
	
}
