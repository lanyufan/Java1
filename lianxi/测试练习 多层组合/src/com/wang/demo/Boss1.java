package com.wang.demo;

/**
 * 单例模式。
 * （1）模式：套路，并非理论，程序员编程经验。
 * （2）单例：单个实例。
 * （3）实例：对象。
 * 总结：单例模式，你写的类，只能生成一个对象。
 * 
 * 
 */
public class Boss1 {

	// 属性
	private String name;
	private int age;
	
	//本类的对象
	private static Boss1 instance = null;

	// 构造
	private Boss1(String name, int age) {
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
	public static Boss1 getInstance(String name,int age){
		
		if (instance == null) {
			instance = new Boss1(name, age);
		}
		
		return instance;
	}
	
	public static Boss1 getInstance(){
		
		if (instance == null) {
			instance = new Boss1("xxx", 80);
		}
		
		return instance;
	}
}






