package com.loto.grammar.e.controlstatement;

/**
 * Author：蓝田_Loto
 * PageName：i_do_while.java
 * Function：do while 循环语句
 */

public class i_do_while {
	public static void main(String[] args) {
		// 实例1：求 1 - 100 的和
		int sum = 0;
		int i = 1;

		do {
			sum += i;
			i++;
		} while (i <= 100);

		System.out.println("1-100的和：" + sum);

		// 实例2：求 1 - 100 的偶数和
		int evensum = 0;
		int j = 1;

		do {
			if (j % 2 == 0) {
				evensum += j;
			}
			j++;
		} while (j <= 100);

		System.out.println("1-100的偶数和:" + evensum);

		// 实例3：求 1 - 100 的奇数和
		int oddsum = 0;
		int k = 1;

		do {
			if (k % 2 == 1) {
				oddsum += k;
			}
			k++;
		} while (k <= 100);
		System.out.println("1-100的奇数和：" + oddsum);
	}
}
