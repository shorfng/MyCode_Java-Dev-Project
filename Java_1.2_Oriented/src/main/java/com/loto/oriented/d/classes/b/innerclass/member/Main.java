package com.loto.oriented.d.classes.b.innerclass.member;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：成员内部类
 */

public class Main {
	public static void main(String[] args) {
		// 创建内部类对象
		OuterClass.InnerClass in = new OuterClass().new InnerClass();

		// 调用内部类的方法
		in.innerMethod();
	}
}
