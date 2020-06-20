package com.loto.api.b.arrays;

import java.util.Arrays;

/**
 * Author：蓝田_Loto
 * PageName：a_binarySearch.java
 * Function：数组的二分查找法
 */

// static [int] binarySearch(int[] a, int key)
// API：使用二分搜索法来搜索指定的 int 型数组，以获得指定的值
// 功能：返回要搜索的元素在数组中出现的索引，如果不存在，返回的是-（插入点-1）
public class a_binarySearch {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int index = Arrays.binarySearch(arr, 7);

		System.out.println(index);
	}
}
