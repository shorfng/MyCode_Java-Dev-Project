package com.loto.grammar.f.array.one.array;

import java.util.Random;

/* 获取指定数组中元素值为奇数的元素个数，具体要求如下：
定义int getEvens(int[] arr)静态方法
方法内要求：获取指定数组arr中元素值为奇数的元素个数，并返回
定义main方法，方法内完成：
(1)定义一个整数数组arr;
(2)获取4个1~50之间（包含1和50）的随机数，并存入arr
(3)传递arr调用getEvens(int[] arr)方法，获取返回值，并打印
 */
public class Practice_ElementNum {
	public static void main(String[] args) {
		// 初始化数组
		int[] arr = new int[4];

		// 将随机数存入数组
		Random rd = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(50) + 1;
			 System.out.println(arr[i]);
		}
		System.out.println("指定数组中元素值为奇数的元素个数:" + getEvens(arr));
	}

	// 定义方法：获取指定数组arr中元素值为奇数的元素个数
	private static int getEvens(int[] arr) {
		// 数组arr中元素值为奇数的元素个数
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				count++;
			}
		}
		return count; // 返回个数
	}
}