package com.wang.oop.demo2;

public class Bank {
	
	//属性
	private String name = "";
	private int money = 0;

	//构造
	public Bank(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//方法
	public void show(){
		System.out.println(name + ",money:" + money);
	}
	
	public void in(int money){
		this.money += money;
		System.out.println("money:" + money);
	}
	
	public void out(int count){
//		money = money - count;
		money -= count;
		System.out.println("money:" + money);
	}
	
	public class Boy{
		private String name="";

		public Boy(String name) {
			this.name = name;
		}
		
		public int outMoney(int count){
			
			money -= count;
			System.out.println("money:"+ money);
			return count;
		}
	}
	
	public class Girl{
		private String name="";

		public Girl(String name) {
			this.name = name;
		}
		
		public void inMoney(int count){
			money += count;
			System.out.println("money:"+ money);
		}
	}
}





