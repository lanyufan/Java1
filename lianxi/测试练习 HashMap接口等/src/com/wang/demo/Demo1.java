package com.wang.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Demo1 {

	public void test1() {

		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add(null);
		list.add(null);
		list.add("bbb");

		System.out.println(list);
	}

	public void test2() {
		HashSet<Student> hs = new HashSet<Student>();

		Student s1 = new Student("aaa", 20);
		Student s2 = new Student("bbb", 21);
		Student s3 = new Student("ccc", 22);
		Student s4 = new Student("ccc", 22);
		Student s5 = new Student("ccc", 22);
		
		System.out.println(s3.equals(s4));

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);

		System.out.println(hs);
	}
	
	public void test3(){
//		TreeSet<String> ts = new TreeSet<String>();
////		ts.add(null);
//		ts.add("ccc");
//		ts.add("bbb");
//		ts.add("aaa");
//		ts.add("aaa");
//		System.out.println(ts);
		
//		TreeSet<Student> ts = new TreeSet<Student>();
//		StudentComparator comparator = new StudentComparator();
//		TreeSet<Student1> ts = new TreeSet<Student1>(comparator);
//		
//		Student1 s1 = new Student1("aaa", 25);
//		Student1 s2 = new Student1("bbb", 22);
//		Student1 s3 = new Student1("ccc", 20);
//		
//		ts.add(s3);
//		ts.add(s2);
//		ts.add(s1);
//		
//		System.out.println(ts);		
	}
	
	public void test4(){
		TreeSet<String> ts = new TreeSet<String>();
		String s1 = "你好";
		String s2 = "我好";
		String s3 = "大家好";
		
		ts.add(s3);
		ts.add(s2);
		ts.add(s1);
		System.out.println(ts);
	}
}















