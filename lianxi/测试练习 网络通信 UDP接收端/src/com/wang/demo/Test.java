package com.wang.demo;

import java.nio.file.attribute.DosFileAttributes;



public class Test {

	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
//		d1.test1();
		
		UDPReceiver receiver = new UDPReceiver();
		receiver.start();
	}

}













