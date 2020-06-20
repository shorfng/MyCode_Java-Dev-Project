package com.loto.api.b.arrays;

import java.util.Arrays;

/**
 * Author：蓝田_Loto
 * PageName：c_toString.java
 * Function：数组变成字符串
 */

// static [String] toString(int[] a)
// API：返回指定数组内容的字符串表示形式
// 功能：将数组变成字符串（形如：[a,b,Practice01_birthday,d]）
public class c_toString {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		String s = Arrays.toString(arr);

		System.out.println(s);  // [1, 2, 3, 4, 5, 6, 7]
	}
}





