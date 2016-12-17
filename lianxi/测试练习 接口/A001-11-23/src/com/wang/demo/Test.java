package com.wang.demo;

import com.wang.demo.test1.Demo2;
import com.wang.demo.test1.MyInterface2;
import com.wang.demo.test2.Computer;
import com.wang.demo.test2.Mobile;
import com.wang.demo.test2.USB;
import com.wang.demo.test3.MyComputer;
import com.wang.demo.test5.Anim;
import com.wang.demo.test5.Dog;
import com.wang.demo.test5.YourDog;


/**
 * 研究抽象类，接口
 * 
 */
public class Test {
	
	
	public static void main(String[] args) {
		
		//测试接口
		MyInterface2 face1;
//		MyInterface2 face2 = new MyInterface2();
		
//		Demo2 d2 = new Demo2("son");
//		d2.run();
//		d2.add1();
		
//		Mobile m = new Mobile("iphone");
//		Computer c = new Computer("IBM");
//		m.call();
//		c.cal();
//		m.setSD("美女照片");
////		c.setHD("帅哥照片");
//		String photo = m.getSD();
//		c.setHD(photo);
//		System.out.println("computer:" + c.getHD());
//		m.setSD("椿哥的照片");
//		
//		String data = m.out();
//		c.in(data);
		
		//多态
//		USB u1 = new Mobile("iphone");
//		USB u2 = new Computer("IBM");
//		u2.in(u1.out());
		
//		MyComputer c = new MyComputer("lenovo");
//		System.out.println(c);
//		
//		String hdmiData = c.out2();
//		String usbData = c.out1();
//		System.out.println("hdmi:" + hdmiData);
//		System.out.println("usb:" + usbData);
		
		Anim a = new Anim("动物");
//		a.eat();
//		a.sleep();
		
		Dog dog = new Dog("大狗");
//		dog.eat();
//		dog.sleep();
//		dog.watch();
		
//		YourDog dog2 = new YourDog("旺财");
//		dog2.eat();
//		dog2.sleep();
//		dog2.watch();
//		dog2.walk();
		
//		Anim a2 = new Dog("大狗");
//		a2.eat();
//		a2.sleep();
//		a2.watch();
		
//		Anim a3 = new YourDog("旺财");
//		a3.eat();
//		a3.sleep();
		
		
		
		
		Anim a1 = new Anim("动物");
		Anim a2 = new Dog("狗类");
		Anim a3 = new YourDog("旺财");
		a1.eat();
		a2.eat();
		a3.eat();
		
	}
}



















