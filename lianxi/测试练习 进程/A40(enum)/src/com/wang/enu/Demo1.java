package com.wang.enu;

import com.wang.enu.test1.EGender;
import com.wang.enu.test1.EWeek;
import com.wang.enu.test1.IGender;
import com.wang.enu.test1.IWeek;

/**
 * 枚举测试。
 *
 */
public class Demo1 {
	
	/**
	 * 接口中的常量。
	 */
	public void test1(){
		
		String gender = IGender.FEMALE;
		System.out.println("gender:" + gender);
		
		String day = IWeek.FRI;
		System.out.println("day:" + day);
	}
	
	/**
	 * 枚举中的常量。
	 */
	public void test2(){
		
		EGender gender = EGender.male;
		System.out.println("gender:" + gender);
		
		EWeek week = EWeek.sun;
		System.out.println("week:" + week);
	}
	
	/**
	 * 枚举的遍历。
	 */
	public void test3(){
		
		for (EWeek day : EWeek.values()) {
			System.out.println("day:" + day);
		}
	}
	
	/**
	 * switch语句对enum的支持。
	 */
	public void test4(){
		//枚举对象
		EWeek day = EWeek.sun;
		
		//switch参数
		switch (day) {
		case mon:
		case tue:
		case wed:
		case thu:
		case fri:
			System.out.println("工作日");
			break;
		case sat:
		case sun:
			System.out.println("休息日");
			break;
		}
	}
	
	
}






