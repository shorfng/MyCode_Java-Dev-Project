package com.loto.oriented.a.method;

// 定义方法,获取数组的最值
public class Practice_array_MinMaxMethod {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 34, 67, 10, 28, 59 };

		// 调用获取数组中的最大值的方法
		int max = getMax(arr);
		System.out.println("max:" + max);

		// 调用获取数组中的最小值的方法
		int min = getMin(arr);
		System.out.println("min:" + min);
	}

	// 获取数组中的最小值的方法
	private static int getMin(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	// 获取数组中的最大值的方法
	private static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
