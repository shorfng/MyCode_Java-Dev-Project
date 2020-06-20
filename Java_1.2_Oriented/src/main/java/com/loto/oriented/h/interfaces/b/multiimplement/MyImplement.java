package com.loto.oriented.h.interfaces.b.multiimplement;

/**
 * Author：蓝田_Loto
 * PageName：MyImplement.java
 * Function：接口的多实现（实现接口A、B）
 */

public class MyImplement implements Interface_A, Interface_B {
	// 重写抽象方法
	public void function() {
		System.out.println("重写抽象方法");
	}
}
