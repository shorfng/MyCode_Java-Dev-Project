package com.loto.oriented.i.codeblock;

/**
 * Author：蓝田_Loto
 * PageName：c_StaticCodeBlock.java
 * Function：静态代码块（使用static修饰，定义在类中方法外，用来给类的静态成员初始化赋值）
 */

public class c_StaticCodeBlock {
	static {
		System.out.println("1、执行static静态代码块");
	}

	{
		System.out.println("3、执行初始化代码块");
	}

	c_StaticCodeBlock() {
		System.out.println("4、执行构造器代码块");
	}

	public static void main(String[] args) {

		System.out.println("2、进入main主方法");

		// 创建对象
		System.out.println("============");
		new c_StaticCodeBlock();

		System.out.println("============");
		new c_StaticCodeBlock();
	}
}
