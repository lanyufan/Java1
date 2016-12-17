package com.wang.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * UDP发送端。
 *
 */
public class UDPSender {
	
	
	private DatagramSocket socket = null;
	
	public void send(String data){
		
		//创建socket对象
		try {
			socket = new DatagramSocket(10000);
			System.out.println("发送端创建成功！10000端口");
			
			//发送数据
			//定义一个数据包
			byte[] buf = data.getBytes();
			//本机IP
//			InetAddress address = InetAddress.getLocalHost();
			InetAddress address = InetAddress.getByName("192.168.2.112");
			System.out.println("ip:" + address.getHostAddress());
			
			
			DatagramPacket packet = new DatagramPacket(buf, 0, buf.length, address, 9000);
			
			socket.send(packet);
			System.out.println("发送端发送数据：" + data);
			
			//关闭
			socket.close();
			System.out.println("发送端关闭");
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void send2(){
		
		try {
			// 创建socket对象
			socket = new DatagramSocket(10000);
			System.out.println("发送端创建成功！10000端口");
			
			// 准备数据
			Scanner scanner = new Scanner(System.in);
			
			while (true) {
				
				String line = scanner.nextLine();
				
				if (line.equals("game")) {
					break;
				}
				
				byte[] buf = line.getBytes();
				InetAddress address = InetAddress.getLocalHost();
				DatagramPacket packet = new DatagramPacket(buf, 0, buf.length, address, 9001);
				
				// 发送数据
				socket.send(packet);
				System.out.println("发送数据：" + line);			
			}
			
			
			// 关闭
			socket.close();
			scanner.close();
			System.out.println("发送端关闭");
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public void close(){
		if (socket != null && !socket.isClosed()) {
			socket.close();
		}
		
	}
	

}





