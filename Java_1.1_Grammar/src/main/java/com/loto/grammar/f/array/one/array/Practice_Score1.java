package com.loto.grammar.f.array.one.array;

import java.util.Random;
import java.util.Scanner;

/*
1.键盘录入班级人数
2.根据录入的班级人数创建数组
3.利用随机数产生0-100的成绩(包含0和100)  
4.要求:
	(1)打印该班级的不及格人数
	(2)打印该班级的平均分
	(3)演示格式如下:
		请输入班级人数:
    	键盘录入:100
        控制台输出:
		不及格人数:19
		班级平均分:87
 */
public class Practice_Score1 {
	public static void main(String[] args) {
		// 键盘录入班级人数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int num = sc.nextInt();

		// 根据录入的班级人数创建数组
		// int[] arr = new int[num];

		// 随机数
		Random rd = new Random();

		// 标志
		int flag = 0;
		int sum = 0;

		for (int i = 0; i < num; i++) {
			// 随机成绩
			int grade = rd.nextInt(101); // [ 0, 101 )
			System.out.println("随机成绩是：" + grade);
			sum += grade; // 全班总分

			// 判断不及格人数
			if (grade < 60) {
				flag++;
			}
		}
		System.out.println("不及格人数是:" + flag);
		System.out.println("平均分是：" + (sum * 1.00 / num));
		sc.close();
	}
}
