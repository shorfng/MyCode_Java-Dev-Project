package com.loto.grammar.e.controlstatement;

/**
 * Author：蓝田_Loto
 * PageName：h_while.java
 * Function：while 循环语句
 */

public class h_while {
	public static void main(String[] args) {
		// 实例1：求 1 - 100 的和
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1-100的和：" + sum);

		// 实例2：求 1 - 100 的偶数和 even
		int j = 1;
		int evensum = 0;
		while (j <= 100) {
			if (j % 2 == 0) {
				evensum += j;
			}
			j++;
		}
		System.out.println("1-100的偶数和：" + evensum);

		// 实例3：求 1 - 100 的奇数和 odd
		int k = 1;
		int oddsum = 0;
		while (k <= 100) {
			if (k % 2 == 1) {
				oddsum += k;
			}
			k++;
		}
		System.out.println("1-100的奇数和：" + oddsum);
	}
}
