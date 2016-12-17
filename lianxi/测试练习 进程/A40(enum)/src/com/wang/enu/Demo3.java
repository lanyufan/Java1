package com.wang.enu;

import java.util.EnumMap;
import java.util.EnumSet;

import com.wang.enu.test3.Color;

public class Demo3 {
	
	public void test1(){
		
		Color color = Color.RED;
		
		System.out.println("color:" + color);
		System.out.println("color:" + color.getName());
		System.out.println("color:" + color.getIndex());
	}
	
	public void test2(){
		
		EnumSet<Color> set = EnumSet.allOf(Color.class);
		
		for (Color color : set) {
			System.out.println(color.getName());
		}
	}
	
	public void test3(){
		EnumMap<Color, String> map = new EnumMap<Color, String>(Color.class);
	
		map.put(Color.RED, "红灯");
		map.put(Color.YELLOW, "黄灯");
		map.put(Color.GREEN, "绿灯");
	
		//遍历
	
	}
}





