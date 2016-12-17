package com.wang.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Demo1 {

	public void test1() {
		
//		ArrayList list1 = new ArrayList();
//		list1.add("aaa");
//		list1.add(123);
		
//		ArrayList<String> list2 = new ArrayList<String>();
		
//		MyClass myClass1 = new MyClass("1班");
//		myClass1.add("aaa");
//		myClass1.add(123);
		
		MyClass<String> myClass2 = new MyClass<String>("2班");
		myClass2.add("student1");
		String s = myClass2.get();
		
		System.out.println(s);
	}

	public void test2() {
		
		MyClass1<Integer> myClass1 = new MyClass1<Integer>("3班");
		myClass1.add(123);
		int i = myClass1.get();
		System.out.println(i);
		
	}
	
	
}















