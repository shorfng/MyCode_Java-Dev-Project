package com.loto.grammar.f.array.one.array;

/*
按以下要求编写代码：
（1）请使用三种格式定义三个数组，都存储5个数字：10,20,30,40,50
（2）分别遍历这三个数组，打印每个元素；
 */
public class Practice_Ergodic {
	public static void main(String[] args) {
		// 方式1
		int[] arr1 = new int[5];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		// 方式2
		int[] arr2 = new int[] { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		// 方式3
		int[] arr3 = { 10, 20, 30, 40, 50 };
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
	}
}
