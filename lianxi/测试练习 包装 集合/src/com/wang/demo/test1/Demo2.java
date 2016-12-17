package com.wang.demo.test1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import javax.management.openmbean.ArrayType;

/**
 * Collection接口
 * List接口
 * ArrayList类
 * LinkedList类
 * 
 * utility 工具
 *
 */
public class Demo2 {
	
	/**
	 * Collection接口 
	 */
	private void test1(){
		
		Collection c = null;
//		
//		c.add(e);
//		c.addAll(c);
//		
//		c.remove(o);
//		c.removeAll(c);
//		
//		c.size();
//		c.clear();
//		c.isEmpty()
//		c.contains(o);
//		c.toArray();
	}
	
	/**
	 * List接口 
	 */
	private void test2(){
		
//		List list = null;
//		
//		list.add(index, element);
//		
//		list.remove(index);
//		
//		list.set(index, element);
//		
//		list.get(index);
//		
//		list.size()
//		list.isEmpty();
//		list.clear();
//		list.contains(o);
//		list.toArray();
//		
//		list.indexOf(o);
//		list.subList(fromIndex, toIndex);
	}
	
	/**
	 * ArrayList类
	 * 
	 * 动态数组。
	 * 
	 */
	public void test3(){
		
//		int[] arr = {0,0,0,0,0};
		
		//实例化
		//默认容量，默认初始值
		ArrayList<String> list1 = new ArrayList<String>();
		
		//给定容量，默认初始值
//		ArrayList<String> list2 = new ArrayList<String>(20);
		
		//用一个已有的集合（Collection类型）创建list
//		ArrayList<String> l = new ArrayList<String>(5);
//		ArrayList<String> list3 = new ArrayList<String>(l);
		
		
		//常用方法
//		list1.add("aaa");
//		
//		System.out.println("size:" + list1.size());
//		System.out.println("empty:" + list1.isEmpty());
//		System.out.println("contains:" + list1.contains("aaa"));
//		System.out.println("get:" + list1.get(0));
//		
//		list1.add(0, "bbb");
//		System.out.println(list1);
//		
//		ArrayList<String> list = new ArrayList<String>();
//		list.addAll(list1);
//		System.out.println(list);
		
//		for (int i = 0; i < 10; i++) {
//			list1.add("aaa"+i);
//		}
//		System.out.println(list1);
		
//		list1.add("aaa0");
//		System.out.println(list1);
//		
//		list1.clear();
//		list1.remove(0);
//		list1.remove("aaa1");
//		System.out.println(list1);
//		
//		ArrayList<String> list = new ArrayList<String>();
//		list.add("aaa0");
//		list.add("aaa1");
//		list.add("aaa2");
//		list.add("aaa4");
//		list.add("aaa6");
//		System.out.println(list);
//		
//		list1.removeAll(list);
//		System.out.println(list1);
		
//		list1.set(0, "aaaa");
//		System.out.println(list1);
//		list1.set(9, "aaa10");
//		System.out.println(list1);
		
//		String  s = list1.get(0);
//		System.out.println(s);
//		
//		int index = list1.indexOf("aaa5");
//		System.out.println(index);
		
//		List list = list1.subList(0, 5);
//		System.out.println(list);
		
		
		//整体赋值
//		ArrayList<String> list = new ArrayList<String>();
		
		//整体赋值
//		for (int i = 1; i <= 20; i++) {
//			String s = "zhang"+i;
//			
//			list.add(s);
//		}
//		System.out.println(list);
		
		String[] arr = {"aaa","bbb","ccc","ddd","eee"};
//		//挨个
//		for (int i = 0; i < arr.length; i++) {
//			String s = arr[i];
//			
//			list.add(s);
//		}
//		System.out.println(list);
		
		//数组变集合
//		List<String> list = Arrays.asList(arr);
//		System.out.println(list);
//		
//		//集合变数组
//		String[] arr1 = new String[list.size()];
//		list.toArray(arr1);
//		System.out.println(Arrays.toString(arr1));
	}
	
	public void test4(){
		
		LinkedList<String> list = new LinkedList<String>();
//		LinkedList<String> list1 = new LinkedList<String>(c);
		
		for (int i = 1; i <= 10; i++) {
			String s = "zhao" + i;
			list.add(s);
		}
		
		list.add("zhao2");
		list.add("zhao2");
		
		System.out.println(list);
		
//		LinkedList<String> list1 = new LinkedList<String>(list);
//		System.out.println(list1);
		
//		ArrayList<String> list2 = new ArrayList<String>(list);
//		System.out.println(list2);
//		
//		LinkedList<String> list3 = new LinkedList<String>(list2);
//		System.out.println(list3);
		
//		list.remove();
//		System.out.println(list);
		
//		list.remove("zhao8");
//		System.out.println(list);
		
//		list.remove(7);
//		System.out.println(list);
		
//		list.removeFirst();
//		list.removeLast();
		
//		list.set(index, element);
		
//		list.get(index);
		
//		list.addFirst(e);
//		list.addLast(e);
		
//		String e = list.element();
//		System.out.println(e);
		
//		list.getFirst();
//		list.getLast();
		
//		list.indexOf("zhao5");
//		list.lastIndexOf("zhao5");
		
//		list.push("aaa");
//		list.push("bbb");
//		list.push("ccc");
//		System.out.println(list);
//		for (int i = 0; i <= list.size(); i++) {
//			String s = list.pop();
//			System.out.println(s);
//		}
		
		
//		String s = list.peek();
//		String s1 = list.peek();
//		System.out.println(s1);
		
//		String s1 = list.poll();
//		String s2 = list.poll();
//		System.out.println(s2);
	}
	
	public void test5(){
		ArrayList<String> list1 = new ArrayList<String>();
		LinkedList<String> list2 = new LinkedList<String>();
		
//		list1.add("aaa");
//		list1.add("bbb");
//		list2.add("ccc");
//		list2.add("ddd");
		for (int i = 0; i < 1000000; i++) {
			String s = "zhao"+i;
			list1.add(s);
			list2.add(s);
		}
		
		//测试插入
		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String s = "chun" + i; 
//			list1.add(s);
//			list1.set(10, s);
			String res = list1.get(i);
		}
//		list1.set(10, "10101010");
		long end1 = System.currentTimeMillis();
		System.out.println("time:" + (end1 - start1) + "ms");
		
		long start2 = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String s = "chun" + i; 
//			list1.add(s);
//			list2.set(10, s);
			String res = list2.get(i);
		}
//		list2.set(10, "10101010");
		long end2 = System.currentTimeMillis();
		System.out.println("time:" + (end2 - start2) + "ms");
	}
	
	/**
	 * 通过LinkedList 模拟 Stack
	 */
	public void test6(){
		
		
		LinkedList<String> list = new LinkedList<String>();
		
		System.out.println(list);
		list.push("aaa");
		list.push("bbb");
		list.push("ccc");
//		System.out.println(list);
		showStack(list);
		System.out.println(list);
		
		String s1 = list.pop();
		System.out.println("s:" + s1);
		String s2 = list.pop();
		System.out.println("s:" + s2);
		String s3 = list.pop();
		System.out.println("s:" + s3);
		
		System.out.println(list);
		
	}
	
	private void showStack(LinkedList<String> list){
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[ " + list.get(i) + " ]");
		}
	}
	

}









































