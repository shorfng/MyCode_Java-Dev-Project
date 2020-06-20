package com.loto.grammar.e.controlstatement;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：d_if_elseif_else.java
 * Function：if 语句的第3种格式 if( ){ } else if( ) { } else{ }
 */

// 键盘录入两个数据，获取这两个数据的较大值
public class d_if_elseif_else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();

		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();

		if (a > b) {
			System.out.println("最大数是：" + a);
		} else if (a < b) {
			System.out.println("最大数是：" + b);
		} else {
			System.out.println("两个数相等");
		}
		sc.close();
	}
}
