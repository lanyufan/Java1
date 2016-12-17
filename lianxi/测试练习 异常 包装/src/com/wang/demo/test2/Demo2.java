package com.wang.demo.test2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo2 {
	
	public void test1(){
		
		Collection c1;
		
//		c1.size();
		
		//增
//		c1.add(e);
		
		//删
//		c1.remove(o);
		
		//查（无）
//		c1.get();
		
		//改（无）
//		c1.set();
	}
	
	public void test2(){
		
		List list;
		
//		list.add(e);
//		list.remove(index);
//		list.get(index);
//		list.set(index, element);
//		list.size();
//		list.contains();
//		list.isEmpty();
//		list.clear();
	}
	
	public void test3(){
		
		ArrayList list = new ArrayList();
		
		String s1 = "aaa";
		list.add(s1);
		
		Student s2 = new Student("zhang1", 20);
		list.add(s2);
		
		System.out.println("size:" + list.size());
		
		Student s3 = (Student)list.get(1);
		
		System.out.println(s3);
	}
	
	public void test4(){
		
		ArrayList<String> list1 = new ArrayList<String>();
		//<String>给集合说明，用集合时放什么类型的对象
		
//		for (int i = 1; i <= 10; i++) {
//			list1.add("aaa" + i);
//		}
//		
//		System.out.println(list1);
//		System.out.println(list1.get(4));
		
		ArrayList<Student> list2 = new ArrayList<Student>();
		for (int i = 1; i <= 10; i++) {
			Student s = new Student("zhang" + i, 20 + i);
			list2.add(s);
		}
		System.out.println(list2);
		
	}
	
	

}













