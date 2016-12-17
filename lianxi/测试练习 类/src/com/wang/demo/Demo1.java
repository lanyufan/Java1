package com.wang.demo;

/**
 * 研究String类。
 * 
 *  （1）属性
 *  （2）构造方法
 *  （3）普通方法
 *
 */
public class Demo1 {
	
	/**
	 * 构造String对象。
	 */
	public void test1(){
		
		String s1 = new String();
		System.out.println("s1:" + s1);
		String s2 = new String("hello");
		System.out.println("s2:" + s2);
		
		String s3 = "world";
		System.out.println("s3:" + s3);
		
		String s4 = s2 + s3;
		System.out.println("s4:" + s4);
	}
	
	/**
	 * 测试属性。
	 */
	public void test2(){
		
		String s1 = "hello";
//		s1.xxx;
	}
	
	/**
	 * 测试方法。
	 */
	public void test3(){
//		String s1 = "hello";
//		String s1 = "你好";
//		//长度
//		System.out.println("length:" + s1.length());
//		//拼接
//		String s2 = s1.concat(" 老婆");
//		System.out.println("concat:" + s2);
//		
//		//子串
//		String s3 = s2.substring(3, 5);
//		System.out.println("substring:" + s3);
//		
//		char c = s2.charAt(1);
//		System.out.println("char:" + c);
		
		//比较
		String s4 = "zhang san";
		String s5 = "zhang si";
		String s6 = "ZHANG SI";
		
//		System.out.println("equals:" + s4.equals(s5));
//		System.out.println("equals:" + s5.equals(s6));
//		System.out.println("equals:" + s5.equalsIgnoreCase(s6));
		
		//start,end
//		System.out.println("start:" + s4.startsWith("zhang"));
//		System.out.println("end:" + s5.endsWith("si"));
		
//		String s7 = "i love you";
//		System.out.println("love:" + s7.contains("love"));
		
		String s8 = "i hate the world,i hate gongchan";
		System.out.println(s8);
		if (s8.contains("gongchan") && s8.contains("hate")) {
			String s9 = s8.replace("hate", "love");
			System.out.println(s9);
		}
	}

}
