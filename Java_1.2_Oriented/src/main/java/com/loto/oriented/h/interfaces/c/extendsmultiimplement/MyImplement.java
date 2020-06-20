package com.loto.oriented.h.interfaces.c.extendsmultiimplement;

/**
 * Author：蓝田_Loto
 * PageName：MyImplement.java
 * Function：类在继承的时候实现多接口（继承于C类的同时，实现接口A和B）
 */

public class MyImplement extends Abstract_C implements Interface_A,Interface_B {
	// 重写抽象方法
	public void function() {
		System.out.println("重写抽象方法");
	}
}