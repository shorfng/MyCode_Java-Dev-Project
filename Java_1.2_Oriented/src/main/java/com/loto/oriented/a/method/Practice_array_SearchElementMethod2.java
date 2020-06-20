package com.loto.oriented.a.method;

import java.util.Scanner;

// 数组元素查找(查找指定元素在数组中出现的所有索引，如果没有提示没找到)
public class Practice_array_SearchElementMethod2 {
	public static void main(String[] args) {
		int[] arr = { 5, 2, 3, 2, 2 };// 如果后面有重复值怎么办?待解决

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字");
		int key = sc.nextInt();
		tmp(arr, key);

		sc.close();
	}

	private static void tmp(int[] arr, int key) {
		int flag = 0;

		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				System.out.println("索引是：" + i);
				flag = 1;
			}
		}

		if (flag == 0) {
			System.out.println("没有找到");
		}
	}
}