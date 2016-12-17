package com.wang.demo.test2;

public class Student {
	
	/*
	 * 可以组合普通类
	 */
	private String name = "";
	
	/*
	 * 可以组合抽象类
	 */
//	private Animal anim = null;
	
	/*
	 * 可以组合接口
	 */
//	private Holiday holiday = null;
	
	private Animal anim = new Animal("大旺财") {
		
		@Override
		public void sleep() {
			System.out.println(this.getName() + ",躺着睡");
		}
		
		@Override
		public void eat() {
			System.out.println(this.getName() + ",泡馍");
		}
	};
	
	private Holiday holiday = new Holiday() {
		
		@Override
		public void yearRest() {
			System.out.println(getName() + "每年休360天");
			
		}
		
		@Override
		public void weekRest() {
			System.out.println(getName() + "每周休7天");
		}
	};
	

	public Student(String name) {
		this.name = name;
	}
	
	public void intro(){
		//名字
		System.out.println("name:" + getName());
		//宠物
		System.out.println("宠物名：" + anim.getName());
		anim.eat();
		anim.sleep();
		
		//假期
		holiday.weekRest();
		holiday.yearRest();
	}
	
	public void study(){
		System.out.println(getName() + ",学习");
	}
	
	public void sleep(){
		System.out.println(getName() + ",休息");
	}

	
	public void setAnim(Animal animal){
		this.anim = animal;
	}
	
	public void setHoliday(Holiday holi){
		this.holiday = holi;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
