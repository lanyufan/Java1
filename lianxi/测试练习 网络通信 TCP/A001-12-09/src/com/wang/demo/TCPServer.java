package com.wang.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.PublicKey;

public class TCPServer {

	public static final int PORT_SERVER = 10000;

	private ServerSocket serverSocket = null;

	public void start() {

		String data = "I am Server";

		try {
			// new
			serverSocket = new ServerSocket(PORT_SERVER);
			System.out.println("server start");
			// 操作
			Socket client = serverSocket.accept();
			System.out.println("server accept client");

			OutputStream os = client.getOutputStream();

			os.write(data.getBytes());
			System.out.println("server output data:" + data);

			// 关闭
			client.close();
			stop();
			System.out.println("server close");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void start1() {

		String path = "E:/lingling.jpeg";

		try {
			// new
			serverSocket = new ServerSocket(PORT_SERVER);
			System.out.println("server start");
			// 操作
			Socket client = serverSocket.accept();
			System.out.println("server accept client");
			
			OutputStream os = client.getOutputStream();
			
			//先从文件拿数据
			File file = new File(path); 
			FileInputStream fis = new FileInputStream(file);
		
			long total = file.length();
			System.out.println("total:" + total + "Byte");
			long per = 0;
			float percent = 0;
			
			byte[] b = new byte[1024];
			int len = 0;
			while ((len = fis.read(b)) != -1) {
				per += len;
				os.write(b, 0, len);
				
				percent = (float)per/total;
				
				percent = percent * 100;
				
				System.out.println("Server data:" + (int)percent + "%");
				
				Thread.sleep(500);
				
			}

			// 关闭
			fis.close();
			client.close();
			stop();
			System.out.println("server close");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void stop() {
		if (serverSocket != null && !serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
