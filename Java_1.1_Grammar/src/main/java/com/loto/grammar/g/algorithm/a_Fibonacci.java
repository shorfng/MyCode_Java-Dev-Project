package com.loto.grammar.g.algorithm;

/* 不死神兔问题（斐波那契数列）
 1、有一对兔子，从出生后第3个月起每个月都生一对兔子
 2、小兔子长到第三个月后每个月又生一对兔子
 3、假如兔子都不死，问第二十个月的兔子对数为多少
 
 思路：下一个月的兔子对数 = 前两个月的兔子对数相加
 arr[i] = arr[i-1] + arr[i-2];
 
第1月* 1										1  arr[0]
第2月* 1										1  arr[1]
第3月* 1 1									2  arr[2] = arr[1] + arr[0];
第4月* 1 1 1									3  arr[3] = arr[2] + arr[1];
第5月* 1 1 1 1 1								5
第6月* 1 1 1 1 1 1 1 1					    8
第7月* 1 1 1 1 1 1 1 1 1 1 1 1 1				13
第8月* 
..... 
第20月* 								    	arr[19]
 
总结规律：arr[i] = arr[i-1] + arr[i-2]; 
 */
public class a_Fibonacci {
	public static void main(String[] args) {
		// 定义数组，总共20个月
		int[] arr = new int[20];

		// 初始化第一个月和第二个月的兔子对数（兔子前两个月都是1对）
		arr[0] = 1;
		arr[1] = 1;

		// 从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println("最终的兔子对数：" + arr[19]);
	}
}
