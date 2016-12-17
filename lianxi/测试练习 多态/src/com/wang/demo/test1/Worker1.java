package com.wang.demo.test1;

public class Worker1 extends Member{
	
	private CallBack callback = null;

	public Worker1(String name, String offer) {
		super(name, offer);
	}

	public void setCallBack(CallBack callback){
		this.callback = callback;
	}
	
	@Override
	public void work() {
		System.out.println(getName() + ",工作");
		
		//工作结束，汇报结果
		callback.result("工作完成");
	}

	@Override
	public void rest() {
		System.out.println(getName() + ",开始工作");
	}
}
