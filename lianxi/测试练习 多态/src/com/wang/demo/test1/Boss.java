package com.wang.demo.test1;

public class Boss extends Member{
	
	private Worker worker = null;

	public Boss(String name, String offer) {
		super(name, offer);
	}

	public Boss(String name, String offer,Worker worker) {
		super(name, offer);
		this.worker = worker;
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
	
	public void result(String res){
		System.out.println(getName() + "收到结果：" + res);
	}


	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	

}
