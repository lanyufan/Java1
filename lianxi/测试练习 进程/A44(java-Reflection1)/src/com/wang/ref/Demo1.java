package com.wang.ref;

/**
 * 反射引入。 （1）类的Class对象。 （2）类的域Field。 （3）类的方法Method。 （4）类的构造Constructor。 （5）类的对象。
 * 
 * 获取类的Class对象。
 * 
 */
public class Demo1 {

	/**
	 * 默认知道Student类型信息。
	 */
	public void myClass1() {

		Student s1 = new Student("张三", 22);

		s1.intro();
		s1.study();
	}

	/**
	 * 通过Student的Class对象获取Student的类型信息。
	 */
	public void myClass2() {

		Class<Student> c1 = Student.class;

		System.out.println("name:" + c1.getName());
		System.out.println("simple name:" + c1.getSimpleName());
		System.out.println("package name:" + c1.getPackage().getName());
		System.out.println("fields:" + c1.getDeclaredFields().length);
		System.out.println("methods:" + c1.getDeclaredMethods().length);
		System.out.println("constructors:"
				+ c1.getDeclaredConstructors().length);
	}

	/**
	 * 获取任意类Class对象的几种方式。
	 */
	public void myClass3() {

		// 方式1
		Class c1 = null;
		try {
			c1 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 方式2
		Class c2 = String.class;

		// 方式3
		String s = "hello";
		Class c3 = s.getClass();

		System.out.println("c1 name:" + c1.getSimpleName());
		System.out.println("c2 name:" + c2.getSimpleName());
		System.out.println("c3 name:" + c3.getSimpleName());

	}

}
