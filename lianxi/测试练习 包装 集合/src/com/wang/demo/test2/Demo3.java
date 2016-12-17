package com.wang.demo.test2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Set
 * 
 * 顺序
 * 重复
 *
 */
public class Demo3 {
	
	
	private void test1(){
		
//		Set<String> set = null;
//		
//		set.add(e);
//		set.remove(o);
//		set.size();
//		set.isEmpty();
	}
	
	public void test2(){
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("aaa");
		hs.add("bbb");
		hs.add("ccc");
		hs.add("ddd");
		hs.add("eee");
		hs.add("eee");
		System.out.println(hs);
		hs.remove("ddd");
		System.out.println(hs);
		
//		//迭代器
//		Iterator<String> it = hs.iterator();
////		it.hasNext();
////		it.next();
//		while (it.hasNext()) {
//			String s = it.next();
//			
//			if (s.equals("ddd")) {
//				it.remove();
//			}
//			
//			System.out.println(s);
//		}
		
//		System.out.println(hs);
	}
	
	public void test3(){
		TreeSet<String>  ts = new TreeSet<String>();
		ts.add("eee");
		ts.add("bbb");
		ts.add("ccc");
		ts.add("ddd");
		ts.add("aaa");
		ts.add("aaa");
		System.out.println(ts);
		
		ts.remove("ccc");
		System.out.println(ts);
		
		
		Iterator<String> it = ts.iterator();
		
		while (it.hasNext()) {
			String s = it.next();
			
			if (s.equals("aaa")) {
				s = "fff";
			}
			System.out.println(s);
		}
		
		System.out.println(ts);
		
		
		
	}

}















