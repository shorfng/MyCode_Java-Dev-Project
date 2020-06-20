package com.loto.oriented.a.method;

// 定义数组元素求和方法
public class Practice_array_SumMethod {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 1, 2, 3, 4, 5 };

		// 调用数组元素求和方法
		int sum = sum(arr);
		System.out.println("sum:" + sum);
	}

	// 定义数组元素求和方法
	private static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
