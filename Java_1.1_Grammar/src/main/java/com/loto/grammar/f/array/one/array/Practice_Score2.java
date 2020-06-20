package com.loto.grammar.f.array.one.array;

/*
按以下要求编写代码：
（1）定义一个数组，存储几个学员的考试分数：
        88.5   96   97   74   88.2    58.5    77.9   90   99
（2）计算这几个学员的平均分；
（3）统计：成绩在80分以上的一共有多少人
*/
public class Practice_Score2 {
	public static void main(String[] args) {
		double[] arr = { 88.5, 96, 97, 74, 88.2, 58.5, 77.9, 90, 99 };
		double sum = 0.0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (arr[i] >= 80.0) {
				count++;
			}
		}
		System.out.println("平局分是：" + (sum / arr.length));
		System.out.println("80分以上的有：" + count + "人 ");
	}
}
