package com.loto.api.b.arrays;

import java.util.Arrays;

/**
 * Author：蓝田_Loto
 * PageName：b_Sort.java
 * Function：对数组进行升序排列
 */

// static [void] sort(int[] a)
// API：对指定的 int 型数组按数字升序进行排序
// 功能：对数组进行升序排列
public class b_Sort {
	public static void main(String[] args) {
		int[] arr = {1, 4, 6, 7, 8, 3};

		// 数组排序
		Arrays.sort(arr);

		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
