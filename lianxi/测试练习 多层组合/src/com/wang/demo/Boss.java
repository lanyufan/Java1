package com.wang.demo;

/**
 * Boss类。 单例模式。 （1）只能生成一个对象。
 *
 *	套路：
 *（1）封死构造。
 *（2）定义一个对象。
 *（3）生成对象。
 */
public class Boss {

	// 属性
	private String name;
	private int age;
	
	//本类的对象
	private static Boss b = null;

	// 构造
	private Boss(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 方法
	public void eat() {
		System.out.println(name + ",喜欢吃高级");
	}

	public void sleep() {
		System.out.println(name + ",喜欢睡沙发");
	}
	
	/**
	 * 获取对象的方法。
	 * @param name
	 * @param age
	 * @return
	 */
	public static Boss createObject(String name,int age){
		
//		Boss b = new Boss(name, age);
//		return b;
		
		if (b == null) {
			b = new Boss(name, age);
		}
		
		return b;
	}
}
