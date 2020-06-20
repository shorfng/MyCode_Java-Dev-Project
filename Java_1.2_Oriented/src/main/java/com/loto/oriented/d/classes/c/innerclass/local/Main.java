package com.loto.oriented.d.classes.c.innerclass.local;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：局部内部类
 */

public class Main {
	public static void main(String[] args) {
		// 匿名对象（调用外部类的方法，外部类的方法里又调用了局部内部类的方法）
		new OuterClass().outerMehod();
	}
}
