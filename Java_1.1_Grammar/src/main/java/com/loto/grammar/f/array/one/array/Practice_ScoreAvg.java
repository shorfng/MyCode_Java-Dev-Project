package com.loto.grammar.f.array.one.array;

/*
(1)在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
(2)选手的最后得分为：去掉一个最高分和一个最低分后,其余4个评委给出的分数的平均值。
(3)不考虑小数部分
思路：最后得分 = （总分- 最大分- 最小分）/ (数组长度- 2)
 */
public class Practice_ScoreAvg {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		// 调用方法
		int sum = getSum(arr);
		int max = getMax(arr);
		int min = getMin(arr);

		// 最后得分 = （总分- 最大分- 最小分）/ (数组长度- 2)
		int result = (sum - max - min) / (arr.length - 2);
		System.out.println("最后得分为：" + result);  // 3
	}

	// 求最大数
	private static int getMax(int[] arr) {
		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (temp < arr[i]) {
				temp = arr[i];
			}
		}
		return temp;
	}

	// 求最小值
	private static int getMin(int[] arr) {
		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (temp > arr[i]) {
				temp = arr[i];
			}
		}
		return temp;
	}

	// 求总分
	private static int getSum(int[] arr) {
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
}
