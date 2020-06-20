package com.loto.grammar.e.controlstatement;

/**
 * Author：蓝田_Loto
 * PageName：g_for.java
 * Function：for 循环语句
 */

public class g_for {
	public static void main(String[] args) {
		// 实例1：求 1 - 100 的和
		int sum = 0;
		for (int i = 1; i <=100; i++) {
			sum += i;
		}
		System.out.println("1-100的和是：" + sum);

		// 实例2：求 1 - 100 的偶数和
		int evensum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evensum += i;
			}
		}
		System.out.println("1-100的偶数和是：" + evensum);

		// 实例3：求 1 - 100 的奇数和
		int oddsum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				oddsum += i;
			}
		}
		System.out.println("1-100的奇数和是：" + oddsum);
	}
}
