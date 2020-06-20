package com.loto.oriented.i.codeblock;

/**
 * Author：蓝田_Loto
 * PageName：b_initCodeBlock.java
 * Function：初始化代码块/构造代码块（直接定义在类中方法外，用来给对象中的成员初始化赋值的代码块）
 */

public class b_initCodeBlock {
	{
		System.out.println("2、执行初始化代码块");
	}

	b_initCodeBlock() {
		System.out.println("3、执行构造器代码块");
	}

	public static void main(String[] args) {
		System.out.println("1、进入main主方法");

		// 创建对象
		System.out.println("============");
		new b_initCodeBlock();

		System.out.println("============");
		new b_initCodeBlock();
	}
}
