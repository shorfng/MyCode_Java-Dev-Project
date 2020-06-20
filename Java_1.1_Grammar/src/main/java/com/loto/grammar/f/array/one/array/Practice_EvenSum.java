package com.loto.grammar.f.array.one.array;

/*
按以下要求编写代码：
（1）定义一个数组，存储以下信息：
     78 23 56 89 88 84 72 99 56 72 100 53 28 
（2）求数组中所有偶数的和
（3）求数组中偶数的数量
 */
public class Practice_EvenSum {
	public static void main(String[] args) {
		int[] arr = { 78, 23, 56, 89, 88, 84, 72, 99, 56, 72, 100, 53, 28 };

		int evensum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evensum += arr[i];
				count++;
			}
		}
		System.out.println("数组中所有偶数的和是：" + evensum);
		System.out.println("数组中偶数的数量是：" + count);
	}
}
