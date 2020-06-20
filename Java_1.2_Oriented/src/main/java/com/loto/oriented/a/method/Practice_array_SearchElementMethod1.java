package com.loto.oriented.a.method;

import java.util.Scanner;

/* 数组元素基本查找（查找指定元素第一次在数组中出现的索引，没有找到返回-1）
(1)给定数组int[] arr = {5,7,3,2,5};
(2)要查询的元素通过键盘录入的方式确定
(3)定义一个查找数组元素第一次出现位置的方法(要查找的元素就是键盘录入的数据)
 */
public class Practice_array_SearchElementMethod1 {
	public static void main(String[] args) {
		int[] arr = { 5, 7, 3, 2, 5 };

		// 键盘输入要查找的元素值
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int num = sc.nextInt();

		// 调用方法1
		int index1 = searchElement1(arr, num);
		System.out.println("方法1指定元素第一次在数组中出现的索引:" + index1);

		// 调用方法2
		int index2 = searchElement2(arr, num);
		System.out.println("方法2指定元素第一次在数组中出现的索引:" + index2);

		sc.close();
	}

	// 方法1：找到要查找的元素后，直接返回索引，没有找到返回-1
	private static int searchElement1(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				return i;
			}
		}
		return -1;
	}

	// 方法2：找到要查找的元素后，直接返回索引，没有找到返回-1
	private static int searchElement2(int[] arr, int num) {
		// 定义一个标记
		int key = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				// 找到要查找的元素后，改变标记，并跳出循环
				key = i;
				break;
			}
		}
		return key;
	}
}
