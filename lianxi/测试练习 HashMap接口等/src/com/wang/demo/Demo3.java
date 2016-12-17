package com.wang.demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class Demo3 {

	public void test1() {

		TreeSet<String> tree = new TreeSet<String>();

		String s1 = "a";
		String s2 = "b1";
		String s3 = "b2";
		String s4 = "c1";
		String s5 = "c2";
		String s6 = "c3";
		String s7 = "c4";

		tree.add(s7);
		tree.add(s6);
		tree.add(s1);
		tree.add(s4);
		tree.add(s3);
		tree.add(s5);
		tree.add(s2);

		System.out.println(tree);

		Set<String> set = tree.subSet("b1", "c4");
		System.out.println(set);
	}

	public void test2() {

		LinkedList<String> list = new LinkedList<String>();
		for (int i = 0; i < 1000; i++) {
			list.add("bbb"+i);
		}
		
		

		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list.add("aaa"+i);
		}

		long end = System.currentTimeMillis();
		System.out.println("time1:" + (end - start) + "ms");
		
		
		
		long start1 = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			String s = list.get(i);
			s = null;
		}

		long end1 = System.currentTimeMillis();
		System.out.println("time1:" + (end1 - start1) + "ms");
		
	}

	public void test3() {
		TreeSet<String> tree = new TreeSet<String>();
		for (int i = 0; i < 100; i++) {
			tree.add("bbb"+i);
		}

		long start = System.currentTimeMillis();

		for (int i = 0; i < 1000000; i++) {
			tree.add("aaa" + i);
		}

		long end = System.currentTimeMillis();
		System.out.println("time2:" + (end - start) + "ms");
		
		long start1 = System.currentTimeMillis();

		Iterator<String> it = tree.iterator();
		while (it.hasNext()) {
			String s = it.next();
			s = null;
		}

		long end1 = System.currentTimeMillis();
		System.out.println("time2:" + (end1 - start1) + "ms");

	}

}
