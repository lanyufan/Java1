package com.wang.demo.extends1;

/**
 * 父类。 （1）属性：name,age （2）方法：getup，work，play，sleep
 *
 */
public class Member {
	// 静态属性
	public static final String ROLE_GRANDPA = "grandpa";
	public static final String ROLE_GRANDMA = "grandma";
	public static final String ROLE_FATHER = "father";
	public static final String ROLE_MOTHER = "mother";
	public static final String ROLE_BABY = "baby";

	// 属性
	private String name = "unknown";
	private int age = 0;
	private String role = "";

	// 构造
	// public Member(){
	// }

	public Member(String name, int age, String role) {
		this.name = name;
		this.age = age;
		this.role = role;
	}

	// 方法
	public void getup() {
		System.out.println(getName() + ",起床了");
	}

	public void work() {

		switch (role) {
		case ROLE_GRANDPA:
			System.out.println(getName() + ",遛鸟");
			break;
		case ROLE_GRANDMA:
			System.out.println(getName() + ",麻将");
			break;
		case ROLE_FATHER:
			System.out.println(getName() + ",上班挣钱");
			break;
		case ROLE_MOTHER:
			System.out.println(getName() + ",上班挣钱");
			break;
		case ROLE_BABY:
			System.out.println(getName() + ",啃老");
			break;
		}

		
	}

	public void play() {
		switch (role) {
		case ROLE_GRANDPA:
			System.out.println(getName() + ",遛鸟");
			break;
		case ROLE_GRANDMA:
			System.out.println(getName() + ",麻将");
			break;
		case ROLE_FATHER:
			System.out.println(getName() + ",加班挣钱");
			break;
		case ROLE_MOTHER:
			System.out.println(getName() + ",骂你没钱");
			break;
		case ROLE_BABY:
			System.out.println(getName() + ",玩");
			break;
		}
	}

	public void sleep() {
		System.out.println(getName() + ",睡觉了");
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
