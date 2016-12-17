package com.wang.demo.test1;

public class Worker extends Member{
	
	private Boss boss = null;

	public Worker(String name, String offer) {
		super(name, offer);
	}

	public void setBoss(Boss b){
		boss = b;
	}
	
	@Override
	public void work() {
		System.out.println(getName() + ",工作");
		
		//工作结束，汇报结果
		boss.result("工作完成");
	}

	@Override
	public void rest() {
		System.out.println(getName() + ",开始工作");
	}
}
