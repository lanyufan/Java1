package com.wang.demo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class Demo1 {

	public void test1() {
		
		//数据
		String data = "hello world";
		
		//路径
		String path = "E:/hello.txt";
		
		//File
		File file = new File(path);
		
		//输出流
		try {
			FileWriter fWriter = new FileWriter(file);
			
			//处理过程
			fWriter.write(data);
			
			fWriter.close();
			System.out.println("输出完成");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void test2(){
		
		//空数据
		String data = "";
		
		//路径
		String path = "E:/hello.txt";
		
		//File
		File file = new File(path);
		
		//输入流
		try {
			FileReader reader = new FileReader(file);
			
			char[] cbuf = new char[1024];
			int len = 0;
			while ((len = reader.read(cbuf)) != -1) {
				
				data = new String(cbuf, 0, len);
				System.out.println(data);
			}
			reader.read(cbuf);
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test3(){
		
		String path = "E:/hello.txt";
		
		try {
//			FileReader reader = new FileReader(path);
			FileReader reader = new FileReader(new File(path));
			//字符缓存流
			BufferedReader br = new BufferedReader(reader);
			String line1 = br.readLine();
			String line2 = br.readLine();
			String line3 = br.readLine();
			String line4 = br.readLine();
			
			
			System.out.println("line1:" + line1);
			System.out.println("line2:" + line2);
			System.out.println("line3:" + line3);
			System.out.println("line4:" + line4);
			
			br.close();
			reader.close();
			
			/*
			 * Buffer流。
			 * （1）流中有自带的缓冲区，可以提高读写效率。
			 * （2）缓冲流对象，提高一些特殊的方法。
			 * 
			 */
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test4(){
		//标准流
		/*
		 * System.in:键盘，标准输入流:InputStream
		 * 
		 * System.out：显示器，标准的输出流。PrintStream(Writer输出字符流)
		 * 
		 */
		//打印流：把数据输出（打印）到该去的地方,更多的玩文本
		
//		try {
//			PrintStream ps = new PrintStream(new File("E:/aaa.txt"));
//			PrintStream ps = new PrintStream(System.out);
//			ps.println("hello");
//			System.out.println("打印完成");
//			ps.close();
			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
		
		InputStream is = System.in;
		byte[] b = new byte[256];
		
		
		try {
			int len = is.read(b);
			
			String data = new String(b, 0, len);
			
			System.out.println(data);
			System.out.println("len:" + data.length());
			
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test5(){
		/*
		 * 标准流重定向。
		 * System.in:  输入--键盘
		 * System.out: 输出--显示器
		 * 
		 */
		//输出
		String data = "hello no world";
		
		File file = new File("E:/aaa.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);
			
//			fos.write(b)
			
			System.setOut(ps);
			System.out.println(data);
			
			
//			fos.close();
			ps.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test6(){
		
		try {
			FileInputStream fis = new FileInputStream(new File("E:/aaa.txt"));
			
//			fis.read(b);
			System.setIn(fis);
			
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			
			System.out.println(line);
			
			fis.close();
			scanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test7(){
		
		try {
			//数据输出
//			FileOutputStream fos = new FileOutputStream(new File("E:/aaa.txt"));
//			DataOutputStream dos = new DataOutputStream(fos);
//			
//			//保存Java中的数据类型
//			dos.writeInt(100);
//			dos.writeByte(10);
//			dos.writeFloat(3.5f);
//			dos.writeBoolean(true);
//			dos.writeChars("hello");
//			dos.close();
//			System.out.println("数据保存完成");
			
			
			DataInputStream dis = new DataInputStream(new FileInputStream(new File("E:/aaa.txt")));
			
			int a1 = dis.readInt();
			byte a2 = dis.readByte();
			float a3 = dis.readFloat();
			boolean a4 = dis.readBoolean();
			
			System.out.println("a1:" + a1);
			System.out.println("a2:" + a2);
			System.out.println("a3:" + a3);
			System.out.println("a4:" + a4);
			
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void test8(){
		
		try {
//			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:/ccc.txt"));
////			String obj = "我爱北京天安门";
////			oos.writeObject(obj);
//			
////			保存自定义对象
//			Girlfriend girlfriend = new Girlfriend("大傻", 55);
//			oos.writeObject(girlfriend);
////			
//			oos.close();
//			System.out.println("对象保存完成");
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:/ccc.txt"));
			
//			String s = (String)ois.readObject();
//			System.out.println(s);
			
			//取出自定义对象
			Girlfriend girlfriend = (Girlfriend)ois.readObject();
			System.out.println(girlfriend);
			ois.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}















