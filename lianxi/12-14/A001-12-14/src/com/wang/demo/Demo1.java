package com.wang.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Demo1 {
	
	//获取类信息
	public void test1(){
		
		Class c1 = Teacher.class;
		
		String name = c1.getName();
		int mod = c1.getModifiers();
		
		System.out.println("class name:" + name);
		System.out.println("modifier:" + Modifier.toString(mod));
	}
	
	//获取域信息
	public void test2(){
		
		try {
			Class c1 = Class.forName("com.wang.demo.Teacher");
			
			//获取属性
//			Field field = c1.getField("name");
//			Field[] fields = c1.getFields();
//			Field field = c1.getDeclaredField("name");
			Field[] fields = c1.getDeclaredFields();
//				
			for (Field f : fields) {
				
				int mod = f.getModifiers();
				Class c = f.getType();
				String name = f.getName();
//				f.get(obj);
				
				System.out.println("mod:" + Modifier.toString(mod));
				System.out.println("type:" + c.getName());
				System.out.println("name:" + name);
				System.out.println("-------------------------");
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}

	//获取构造信息
	public void test3(){
		
		try {
			Class c1 = Class.forName("com.wang.demo.Teacher");
			
//			c1.getConstructors();
//			c1.getConstructor(parameterTypes);
			Constructor[] cons = c1.getDeclaredConstructors();
//			c1.getDeclaredConstructor(parameterTypes);
			
//			Constructor cons = c1.getDeclaredConstructor(String.class,int.class);
			
			for (Constructor con : cons) {
				
				int mod = con.getModifiers();
				String name = con.getName();
				int count = con.getParameterCount();
				Class[] arr = con.getParameterTypes();
				
				System.out.println("mod:" + Modifier.toString(mod));
				System.out.println("name:" + name);
				System.out.println("para count:" + count);
				for (Class class1 : arr) {
					System.out.println("para type:" + class1.getName());
				}
				
				Parameter[] parameters = con.getParameters();
				for (Parameter p : parameters) {
					System.out.println("para name:" + p.getName());
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} 
	}
	
	
	public void test4(){
		try {
			Class c1 = Class.forName("com.wang.demo.Teacher");
			
			//获取普通方法
			Method[] methods = c1.getDeclaredMethods();
			
			for (Method method : methods) {
				
				int mod = method.getModifiers();
				Class rType = method.getReturnType();
				String name = method.getName();
				Class[] pTypes = method.getParameterTypes();
				Parameter[] paras = method.getParameters();
				
				System.out.println("mod；" + Modifier.toString(mod));
				System.out.println("return type；" + rType.getName());
				System.out.println("name；" + name);
				for (Class type : pTypes) {
					System.out.println("para type；" + type.getName());
				}
				
				for (Parameter para : paras) {
					System.out.println("para name；" + para.getName());
				}
			}
//			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} 
		
		
	}
}









