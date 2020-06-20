package com.loto.grammar.f.array.one.array;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：e_SearchIndex.java
 * Function：一维数组元素查找(查找指定元素第一次在数组中出现的索引)
 */

public class e_SearchIndex {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 6, 8 };

		// 键盘输入要查找的元素
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入要查找的元素：");
		int search = sc.nextInt();

		// 定义一个标志，作为是否找到输入的元素
		int flag = 0;

		// 数组遍历
		for (int i = 0; i < arr.length; i++) {
			if (search == arr[i]) { // 当找到该元素，标志改为1
				flag = 1;
				System.out.println("要查找的元素第一次在数组中出现的索引是：" + i);
				break; // 结束循环
			}
		}

		// 数组遍历结束后，判断标志是否为0，如果为0，则表示没有找到该元素
		if (flag == 0) {
			System.out.println("输入的元素不存在数组");
		}
		sc.close();
	}
}
