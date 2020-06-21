package com.loto.collections.a.collection.a.use;

/**
 * Author：蓝田_Loto
 * Date：2018-12-04 22:43
 * PageName：d_Collection_iterable_Array.java
 * Function：Collection_遍历
 */

public class d_Collection_iterable_Array {
	public static void main(String[] args) {
		// for遍历字符串数组
		String[] str = { "abc", "it", "cn" };
		for (String s : str) {
			// 对象数组遍历的时候,调用对象的方法
			System.out.println(s.length());
		}

		System.out.println("===============");

		// for遍历数组
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i : arr) {
			System.out.println(i + 1);
		}
		// 实际上是一个一个做赋值操作，所以arr[0]始终不变
		System.out.println(arr[0]);
	}
}
