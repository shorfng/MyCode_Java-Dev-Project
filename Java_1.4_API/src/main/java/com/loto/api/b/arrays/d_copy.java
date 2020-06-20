package com.loto.api.b.arrays;

import java.util.Arrays;

/**
 * Author：蓝田_Loto
 * PageName：d_copy.java
 * Function：数组复制
 */

// 功能实现：定义一个方法，接收一个数组，数组中存储10个学生考试分数，该方法要求返回考试分数最低的后三名考试分数
public class d_copy {
	public static void main(String[] args) {
		int[] arr = { 98, 45, 76, 45, 78, 99, 100 };
		int[] newarr = method(arr); // 将返回的考试分数组成一个新数组

		System.out.println(Arrays.toString(newarr));
	}

	private static int[] method(int[] arr) {
		// 进行数组元素排序（元素值从小到大进行排序）
		Arrays.sort(arr);

		// 存储后三名考试分数
		int[] result = new int[3];

		// 把arr数组前3个元素复制到result数组中
		System.arraycopy(arr, 0, result, 0, 3);

		return result;
	}
}
