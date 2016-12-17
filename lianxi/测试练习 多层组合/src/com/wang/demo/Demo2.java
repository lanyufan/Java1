package com.wang.demo;

/**
 * 组合
 * 
 * （1）多重组合+static
 *
 */
public class Demo2 {
	
	public void test1(){
		MySystem sys = new MySystem("aaa");
		System.out.println(sys.name);
		
		//通过对象调用
//		sys.out.myPrint();
		
		//通过类直接调用
		MySystem.out.myPrint();
		
		//三级组合
		MySystem.out.print.print();
	}
	
	/**
	 * 参数传递
	 * （1）基本类型
	 * （2）引用类型
	 * 
	 *  基本类型，函数调用参数传递，不影响原值。
	 *  引用类型，函数调用参数传递，影响原值。
	 */
	public void test2(){
		//基本类型
		int x = 5;
		int y = 10;
		System.out.println("x=" + x + ",y=" + y);
		
		test3(x, y);
		
		System.out.println("x=" + x + ",y=" + y);
		
		//引用类型
		Student s1 = new Student("zhang", 20);
		Student s2 = new Student("zhao", 30);
		s1.intro();
		s2.intro();
		
		test4(s1, s2);
		
		s1.intro();
		s2.intro();
	}
	
	public void test3(int a, int b){
		a++;
		b--;
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
	
	public void test4(Student a,Student b){
		a.setName("xxx");
		b.setAge(100);
	}
}
