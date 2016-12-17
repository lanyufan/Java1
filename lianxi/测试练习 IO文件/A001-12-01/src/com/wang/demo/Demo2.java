package com.wang.demo;

import java.io.File;
import java.io.IOException;

public class Demo2 {
	
	public void test1(){
		//路径，File类，IO流
		String path = "E:/hello.txt";
		
		
//		File f = new File(path);
//		
//		System.out.println("exist:" + f.exists());
		
//		try {
//			
//			boolean isSucc = f.createNewFile();
//			System.out.println("create file:" + isSucc);
//			
//		} catch (IOException e) {
//			System.out.println("create file IOException"); 
//			e.printStackTrace();
//		}
		
//		boolean isSucc = f.delete();
//		System.out.println("del:" + isSucc);
		
		String dirName = "E:/music";
		
		File dir = new File(dirName);

//		boolean b = dir.mkdir();
////		dir.mkdirs();
//		System.out.println("make dir:" + b);
		
		boolean b = dir.delete();
		System.out.println("del dir:" + b);
		
	}

	public void test2(){
		
		String path = "e:/aaa/bbb/ccc/hello.txt";
		String dirPath = "e:/aaa/bbb/ccc";
		
//		File dir = new File(dirPath);
//		boolean b = dir.mkdir();
//		boolean b = dir.mkdirs();
//		System.out.println("dir:" + b);
		
		
		
		
		File f = new File(path);
		
		
		
		
		
		try {
			boolean b = f.createNewFile();
			System.out.println("create file:" + b);
			
		} catch (IOException e) {
			System.out.println("IOException");
			e.printStackTrace();
		}
	}
}
