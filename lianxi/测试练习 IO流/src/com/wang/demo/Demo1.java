package com.wang.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Demo1 {

	public void test1() {
		
		//数据
		String data = "hello world 你好 世界";
		
		//路径
		String path = "e:/hello.txt";
		
		//File
		File file = new File(path);
		
		//IO流(写hello world)
		try {
			//定义流
			FileOutputStream fos = new FileOutputStream(file);
			
			//输出数据
			fos.write(data.getBytes());
			
			//关闭流
			fos.close();
			System.out.println("输出成功");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test2(){
		
		String data = "";
		
		String path = "e:/hello.txt";
		
		File file = new File(path);
		
//		System.out.println("len:" + file.length());
		
		try {
			FileInputStream fis = new FileInputStream(file);
			
			//读数据
			byte[] b = new byte[20];
			fis.read(b);
			
			fis.close();
			
			data = new String(b);
			
			System.out.println("读到的数据：" + data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test3(){
		
		String data = "hello china";
		
		try {
			FileOutputStream fos =new FileOutputStream(new File("e:/hello.txt"));
			
			//int型，代表字符编码
//			fos.write(97);
			
			//byte[]，字节数据
			byte[] b = data.getBytes();
//			fos.write(b);
			
			//可以精确制定数据
			fos.write(b, 6, 5);
			
			fos.close();
			System.out.println("输出成功");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test4(){
		
		String data = "";
		
		try {
			FileInputStream fis = new FileInputStream(new File("e:/hello.txt"));
			
			//只读一个
//			int i = fis.read();
//			System.out.println("i:" + i);
			
//			byte[] arr = new byte[4];
//			for (int j = 0; j < 4; j++) {
//				fis.read(); 
//			}
			//-1,代表文件中的数据已经读取结束，（到达文件末尾）
//			System.out.println("read:" + fis.read());
			
			//b--buffer--缓存
			byte[] b = new byte[20];
			int len = 0;
			while ((len = fis.read(b)) != -1) {
				
				String temp = new String(b,0,len);
//				data += temp;
				
//				String temp = new String(b);
				
				System.out.println("read:" + temp);
			}
			
			System.out.println("data:" + data);
			
			fis.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test5(String src,String dst){
		
		try {
			
			FileInputStream fis = new FileInputStream(new File(src));
			FileOutputStream fos = new FileOutputStream(new File(dst));
			
			byte[] b = new byte[1024];
			int len = 0;
			int count = 1;
			while ((len = fis.read(b)) != -1) {
				
				//已经读到了1024个字节，处理
//				fos.write(b, 0, len);
				
				fos.write(b);
				
				System.out.println("count:" + count + "," + len + " byte");
				count++;
			}
			fis.read(b);
			
			fos.write(b);
			
			fis.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	
}















