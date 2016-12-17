package com.wang.demo.test1;

public class Boss1 extends Member implements CallBack{
	
	private Worker1 worker = null;

	public Boss1(String name, String offer) {
		super(name, offer);
	}
	
	@Override
	public void work() {
		//提示
		System.out.println(getName() + ",工作");
		
		//老板指示员工工作
		worker.work();
	}
	
	@Override
	public void rest() {
		System.out.println(getName() + ",开始休息");
	}

	public void setWorker(Worker1 worker) {
		this.worker = worker;
	}

	@Override
	public void result(String info) {
		
		System.out.println(getName() + "收到信息：" + info);
	}
	
	

}
