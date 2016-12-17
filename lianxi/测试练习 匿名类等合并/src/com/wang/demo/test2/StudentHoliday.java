package com.wang.demo.test2;

public class StudentHoliday implements Holiday{

	@Override
	public void weekRest() {
		System.out.println("每周休两天");
		
	}

	@Override
	public void yearRest() {
		System.out.println("每年寒暑假");
	}

}
