package com.wang.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 * 研究UDP用到的类。 
 *
 */
public class Demo1 {
	
	/**
	 * InetAddress
	 */
	public void test1(){
		
		try {
			//弄对象
			InetAddress inetAddress = InetAddress.getLocalHost();
//			String ip = inetAddress.getHostName();
//			String ip = inetAddress.getHostAddress();
//			System.out.println("local IP:" + ip);
			
			InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
			String ip2 = inetAddress2.getHostAddress();
			System.out.println("local IP:" + ip2);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} 
		//看方法
		
		
	}
	
	/**
	 * DatagramPacket
	 * 
	 * 封装个数据。数据是字节格式。
	 * 
	 */
	public void test2(){
		
		/*
		 * Packet，数据包。
		 */
		String str = "hello";
		byte[] buf = str.getBytes();
		
		InetAddress myAddress;
		try {
			myAddress = InetAddress.getLocalHost();
			//构造数据包
			DatagramPacket packet = new DatagramPacket(buf, 0, buf.length, myAddress, 8000);
			
//			//给包中装东西
//			packet.setAddress(iaddr);
//			packet.setPort(iport);
//			packet.setData(buf);
//			packet.setLength(length);
//			
//			//从包中拿东西
//			packet.getAddress();
//			packet.getPort();
//			packet.getData();
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * DatagramSocket.
	 * 
	 * 负责通信。
	 */
	public void test3(){
		
		try {
			DatagramSocket socket = new DatagramSocket(9000);
			
//			DatagramPacket packet = new DatagramPacket(buf, 0, buf.length, myAddress, 8000);
			
//			socket.send(packet);
			
//			socket.receive(p);
			
			socket.close();
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}











