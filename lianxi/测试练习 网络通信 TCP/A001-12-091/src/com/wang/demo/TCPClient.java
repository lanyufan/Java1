package com.wang.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Client
 *
 */
public class TCPClient {

	public static final int PORT_SERVER = 10000;

	private Socket client = null;

	public void connect() {

		try {

			InetAddress address = InetAddress.getLocalHost();
			client = new Socket(address, PORT_SERVER);
			System.out.println("client create");

			InputStream is = client.getInputStream();

			byte[] b = new byte[1024];
			int len = is.read(b);
			System.out.println("client receive data");

			String data = new String(b, 0, len);
			System.out.println("client data:" + data);

			disConnect();
			System.out.println("client disconnection");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void connect1() {
		
		String path = "D:/bbb.jpeg";

		try {

			InetAddress address = InetAddress.getLocalHost();
			client = new Socket(address, PORT_SERVER);
			System.out.println("client create");

			InputStream is = client.getInputStream();
			FileOutputStream fos = new FileOutputStream(new File(path));

			byte[] b = new byte[1024];
			int len = 0;
			while((len = is.read(b)) != -1){
				fos.write(b, 0, len);
			}

			fos.close();
			disConnect();
			System.out.println("client disconnection");

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void disConnect() {

		if (client != null && !client.isClosed()) {
			try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
