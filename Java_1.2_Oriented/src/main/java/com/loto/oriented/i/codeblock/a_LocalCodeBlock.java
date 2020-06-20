package com.loto.oriented.i.codeblock;

/**
 * Author：蓝田_Loto
 * PageName：a_LocalCodeBlock.java
 * Function：局部代码块（直接定义在方法内部的代码块，用来限制变量的作用范围）
 */

public class a_LocalCodeBlock {
	public static void main(String[] args) {
		// 13-16行，局部代码块
		{
			int a = 10;
			System.out.println("a = " + a);
		}

		// 报错
		// System.out.println("a = " + a);

		// 一般不会直接使用局部代码块，而是结合if、while、for、try等关键字，表示一块代码区域
		if (true) {
			System.out.println("局部代码块的使用场景");
		}
	}
}
