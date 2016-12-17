package com.wang.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP接收端。
 *
 */
public class UDPReceiver {

	private DatagramSocket socket = null;

	public void start() {

		// 创建socket对象
		try {
			socket = new DatagramSocket(9001);
			System.out.println("接收端启动成功！9000端口");

			// 接收数据
			// 定义一个空包
			byte[] buf = new byte[1024];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);

			// 处理数据
			String data = new String(packet.getData(), 0, packet.getLength());

			// 显示
			System.out.println("rev data:" + data);

			// 关闭
			socket.close();
			System.out.println("接收端关闭！");

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void start2() {
		// 创建socket对象
		try {
			socket = new DatagramSocket(9001);
			System.out.println("接收端启动成功！9001端口");

			while (true) {
				
				// 接收数据
				// 定义一个空包
				byte[] buf = new byte[1024];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);

				// 处理数据
				String data = new String(packet.getData(), 0, packet.getLength());

				// 显示
				System.out.println("rev data:" + data);
				
				if(data.equals("over")){
					break;
				}
			}

			// 关闭
			socket.close();
			System.out.println("接收端关闭！");

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void stop() {

		if (socket != null && !socket.isClosed()) {
			socket.close();
		}
	}

}
