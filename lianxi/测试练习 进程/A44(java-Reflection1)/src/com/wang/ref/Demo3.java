package com.wang.ref;

import java.lang.reflect.Field;

/**
 * 运行时获得类的成员变量。
 * 
 */
public class Demo3 {

	/**
	 * 获取成员变量。
	 */
	public void myFields1() {

		try {
			// 获取Class对象
			Class c = Class.forName("com.wang.ref.Student");

			// 获取类成员
			// Field[] fields = c.getFields();
			/* getFields()方法只能获取public类型属性 */

			Field[] fields = c.getDeclaredFields();
			/* getDeclaredFields()方法能获取所有属性 */

			System.out.println("field count:" + fields.length);

			for (Field f : fields) {
				String name = f.getName();
				System.out.println("field name:" + name);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Field类研究。
	 */
	public void myFields2() {

		Student s1 = new Student("zhang", 20);
		Student s2 = new Student("wang", 21);

		try {
			// 获取Class对象
			Class c = Class.forName("com.wang.ref.Student");

			// 获取类全部域
			Field[] fields = c.getDeclaredFields();
			System.out.println("field count:" + fields.length);
			for (Field f : fields) {
				String name = f.getName();
				System.out.println("field name:" + name);
			}

			// 选取一个域（属性）
			Field f = fields[1];

			// 获取属性的修饰符
			int m = f.getModifiers();
			
			System.out.println("modifier:" + m);

			// 获取属性的值
			f.setAccessible(true); // 把private变public，否则无法get值。
			String value1 = (String) f.get(s1);
			String value2 = (String) f.get(s2);
			System.out.println("s1 name:" + value1);
			System.out.println("s2 name:" + value2);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}
}
