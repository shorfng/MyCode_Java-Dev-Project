package com.loto.oriented.a.method;

/**
 * Author：蓝田_Loto
 * PageName：c_TypeParameter_Reference.java
 * Function：参数传递 - 引用类型：形式参数的值改变，直接影响实际参数的值
 */

public class c_TypeParameter_Reference {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.print("方法调用前：");   // 方法调用前：12345

		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println(" ");

		// 方法调用
		change(arr);
		System.out.print("方法调用后：");  // 方法调用后：14385
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	private static void change(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			// 如果元素是偶数，值就变为以前的2倍
			if (arr[i] % 2 == 0) {
				arr[i] *= 2;
			}
		}
	}
}
