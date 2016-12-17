package com.wang.demo.test1;

public abstract class Member {
	
	public static final String OFFER_BOSS = "boss";
	public static final String OFFER_WORKER = "worker";
	
	private String name = "";
	private String offer = "";
	

	public Member(String name, String offer) {
		this.name = name;
		this.offer = offer;
	}
	
	public abstract void work();
	public abstract void rest();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
