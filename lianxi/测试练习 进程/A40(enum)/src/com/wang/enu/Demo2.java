package com.wang.enu;

import com.wang.enu.test2.EStateMachine;

/**
 * 测试通话状态机。 
 *
 */
public class Demo2 {
	
	/**
	 * 通话状态。 
	 */
	public void test1(EStateMachine state){
		
		switch (state) {
		case IDLE:
			System.out.println("空闲状态");
			break;
		case RINGING:
			System.out.println("响铃状态");
			break;
		case TALKING:
			System.out.println("通话状态");
			break;
		}
	}
	
	/**
	 * 枚举类型的方法。
	 */
	public void test2(){
		
		//枚举对象
		EStateMachine state = EStateMachine.RINGING;
		
		//常量名字
		String name = state.name();
		System.out.println("name:" + name);
		
		//常量序号
		int order = state.ordinal();
		System.out.println("order:" + order);
		
		//所有常量值
		EStateMachine[] states = EStateMachine.values();
	}

}





