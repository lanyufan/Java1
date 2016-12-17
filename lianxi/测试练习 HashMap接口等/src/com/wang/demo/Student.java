package com.wang.demo;

public class Student implements Comparable<Student>{
	
	private String name;
	private int age;
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + "-" + age;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		if (obj instanceof Student) {
//			
//			Student other = (Student)obj;
//			
//			if (this.name.equals(other.name)) {
//				return true;
//			}
//		}
//		
//		return false;
//	}


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

	@Override
	public int compareTo(Student o) {
//		return name.compareTo(o.name);
		
		if (this.age > o.age) {
			return -1;
		}else if(this.age < o.age) {
			return 1;
		}
		
		return 0;
	}
}
