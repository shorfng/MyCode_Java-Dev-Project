package com.loto.grammar.f.array.one.array;

/* 数组元素位置互换程序，要求如下：
（1）定义static void  judge(int[] arr)方法
方法内完成：比较指定数组arr中第一个角标的元素值与倒数第一个角标的元素值之间的大小
如果第一个角标的元素值小于倒数第一个角标的元素值，则将2个元素在数组中的位置互换，
否则数组不变。判断完将arr中的所有元素打印
（2）定义main方法，要求完成：
    2.1 定义一个整数数组arr，包含元素11,21,5,12,7,14
    2.2 传递arr调用judge(int[] arr)方法   
 */
public class Test01 {
	public static void main(String[] args) {
		int[] arr = { 11, 21, 5, 12, 7, 14 };
		
		// 调用方法
		judge(arr);
	}

	private static void judge(int[] arr) {
		int i = 0; // 数组第一个元素的索引
		int j = arr.length - 1; // 数组最后一个元素的索引

		if (arr[i] < arr[j]) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}

		// 遍历数组
		System.out.print("遍历数组：");
		for (int w = 0; w < arr.length; w++) {
			System.out.print(arr[w] + " ");
		}
	}
}
