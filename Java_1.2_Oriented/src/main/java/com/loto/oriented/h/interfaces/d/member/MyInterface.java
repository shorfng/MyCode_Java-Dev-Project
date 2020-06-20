package com.loto.oriented.h.interfaces.d.member;

/**
 * Author：蓝田_Loto
 * PageName：MyInterface.java
 * Function：接口的定义（定义成员变量和成员方法）
 */

public interface MyInterface {
	// 定义接口中的成员变量
	public static final int i = 1; // 写全修饰符
	public int j = 2;              // 写部分修饰符
	int k = 3;                     // 省略修饰符

	// 定义接口中的成员方法
	public abstract void show1();
	public void show2();
	abstract void show3();
	void show4();
}
