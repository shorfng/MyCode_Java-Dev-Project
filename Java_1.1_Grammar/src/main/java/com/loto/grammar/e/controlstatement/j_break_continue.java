package com.loto.grammar.e.controlstatement;

/**
 * Author：蓝田_Loto
 * PageName：j_break_continue.java
 * Function：跳出循环
 */

public class j_break_continue {
	public static void main(String[] args) {
		// 1、break：在循环中，跳出循环执行后面的代码
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break; // 输出2次（打印完两次HelloWorld之后结束循环）
			}
			System.out.println("HelloWorld " + i);
		}

		// 2、break：在switch语句中使用，作用是终止某个case并跳出switch结构

		// 3、在嵌套循环中使用
		// 写在内存循环，想要结束外层循环，需要使用循环标号（这里是flag：）
		int i, j; // 定义两个循环变量
		flag: for (i = 1; i <= 9; i++) { // 外层循环
			for (j = 1; j <= i; j++) { // 内层循环
				if (i > 4) { // 判断i的值是否大于4
					break flag; // 跳出外层循环
				}
				System.out.print("*"); // 打印*
			}
			System.out.print("\n"); // 换行
		}

		System.out.println("============");

		// 3、continue：只能在循环中使用
		for (int k = 1; k <= 5; k++) {
			if (k == 3) {
				continue; // 输出4次（只有i=3没有执行打印）
			}
			System.out.println("HelloWorld " + k);
		}

		// 使用continue实现奇数和
		int sum = 0;
		for (int w = 1; w <= 10; w++) {
			if (w % 2 == 0) { // i是一个偶数，不累加
				continue; // 结束本次循环
			}
			sum += w; // 实现sum和i的累加
		}
		System.out.println("sum = " + sum);
	}
}
