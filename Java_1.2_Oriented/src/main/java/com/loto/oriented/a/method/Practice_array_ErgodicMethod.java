package com.loto.oriented.a.method;

// 定义方法，完成数组遍历
public class Practice_array_ErgodicMethod {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 11, 22, 33, 44, 55 };

		printArray1(arr);
		printArray2(arr);
	}

	// 定义遍历数组的方法
	private static void printArray1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	// 按照以下格式遍历数组 [元素1, 元素2, 元素3, ...]
	private static void printArray2(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}
}