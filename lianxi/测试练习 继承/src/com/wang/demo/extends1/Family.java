package com.wang.demo.extends1;


/**
 * 家庭类。
 * 
 * 属性：成员。
 * 
 * 方法：一天开始，一天结束。
 * 
 */
public class Family {

	// 属性
	private Grandpa grandpa = null;
	private Grandma grandma = null;
	private Father father = null;
	private Mother mother = null;
	private Baby baby = null;

	// 构造
	public Family(Grandpa grandpa, Grandma grandma, Father father,
			Mother mother, Baby baby) {
		this.grandpa = grandpa;
		this.grandma = grandma;
		this.father = father;
		this.mother = mother;
		this.baby = baby;
	}

	// 方法
//	public void intro() {
//		grandpa.intro();
//		grandma.intro();
//		father.intro();
//		mother.intro();
//		baby.intro();
//	}

	private void dayStart() {
		grandpa.getup();
		grandma.getup();
		father.getup();
		mother.getup();
		baby.getup();
	}

	private void work() {
		// 工作
		grandpa.work();
		grandma.work();
		father.work();
		mother.work();
		baby.work();

	}

	private void play() {
		// 娱乐
		grandpa.play();
		grandma.play();
		father.play();
		mother.play();
		baby.play();
	}

	private void dayEnd() {
		grandpa.sleep();
		grandma.sleep();
		father.sleep();
		mother.sleep();
		baby.sleep();
	}
	
	public void day(){
		dayStart();
		work();
		play();
		dayEnd();
	}
}







