package com.loto.grammar.f.array.two.array;

/**
 * Author：蓝田_Loto
 * PageName：b_Ergodic.java
 * Function：二维数组遍历
 */

public class b_Ergodic {
	public static void main(String[] args) {
		// 数组定义初始化
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 1、正序遍历数组 (依次输出数组中的每一个元素)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("==============");

		// 2、逆序遍历数组 (把数组反过来遍历)
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
