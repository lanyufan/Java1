package com.wang.demo;


/**
 * 研究抽象类，接口
 * 
 */
public class Test {
	
	public static void main(String[] args) {
		
		//抽象类new对象
		Member mem1 = null;
//		Member mem2 = new Member("zhang", 30);
//		mem.play();
		/*
		 * （1）抽象类，能不能声明引用变量？（可以）
		 * （2）抽象类，能不能实例化（new对象）（不可以）
		 * （3）抽象类，能不能被继承
		 * （4）抽象类可不可以继承自抽象类
		 */
		
//		Father father = new Father("zhao", 30);
//		father.getup();
//		father.work();
//		father.play();
//		father.sleep();
		
		//声明抽象类的引用变量
		A a1 = null;
		B b1 = null;
		C c1 = new C("ccc");
		c1.add(2, 3);
		c1.sub(2, 3);
		c1.mul(2, 3);
		c1.div(2, 3);
		
		
	}
}










