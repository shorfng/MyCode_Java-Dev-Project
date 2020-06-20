package com.loto.grammar.f.array.two.array;

/**
 * Author：蓝田_Loto
 * PageName：c_Value_MaxMin.java
 * Function：二维数组获取最值(获取数组中的最大值最小值)
 */

public class c_Value_MaxMin {
	public static void main(String[] args) {
		// 数组定义初始化
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 1、获取最大值：定义一个参照物，假设第0个数组元素最大
		int max = arr[0][0];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
			}
		}
		System.out.println("数组中最大值是：" + max);

		// 2、获取最小值：定义一个参照物，假设第0个数组元素最小
		int min = arr[0][0];

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length - 1; j >= 0; j--) {
				if (arr[i][j] < min) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("数组中最小值是：" + min);
	}
}
