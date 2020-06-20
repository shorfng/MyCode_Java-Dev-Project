package com.loto.grammar.f.array.one.array;

import java.util.Scanner;

/* 获取数组中元素值为偶数的累加和与元素值为奇数的累加和，并计算出它们之间的差值
要求：
1、定义int getNum(int[] arr)静态方法，该方法要求完成：
（1）获取指定数组arr中元素值为偶数的累加和
（2）获取指定数组arr中元素值为奇数的累加和
（3）返回偶数累加和与奇数累加和之间的差值（大于-1的整数）
2、定义main方法，在main方法中完成：
（1）获取键盘录入的5个int数组，并存放在int数组arr中 ，输入前提示输入的是第几个值
（2）传递数组arr调用getNum(int[] arr)方法,获取返回值，并打印输出
 */
public class Test02 {
	public static void main(String[] args) {
		// 定义数组
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);

		// 循环输入数字，并存入数组
		for (int i = 1; i <= 5; i++) {
			System.out.println("请输入第" + i + "个数:");
			int num = sc.nextInt();
			arr[i - 1] = num;
		}

		System.out.println("偶数累加和与奇数累加和之间的差值" + getNum(arr));

		sc.close();
	}

	private static int getNum(int[] arr) {
		// 指定数组arr中元素值为偶数的累加和
		int ousum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				ousum += arr[i];
			}
		}
		// System.out.println("指定数组arr中元素值为偶数的累加和:" + ousum);

		// 指定数组arr中元素值为奇数的累加和
		int jisum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				jisum += arr[i];
			}
		}
		// System.out.println("指定数组arr中元素值为奇数的累加和:" + jisum);

		// 偶数累加和与奇数累加和之间的差值
		int result = jisum - ousum;

		return result; // 返回差值
	}
}
