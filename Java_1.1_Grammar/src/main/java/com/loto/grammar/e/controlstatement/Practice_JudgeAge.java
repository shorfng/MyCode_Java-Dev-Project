package com.loto.grammar.e.controlstatement;

import java.util.Scanner;

/*
 A.	请用户输入一个年龄；
 B.	判断年龄：
    1—3岁：打印：婴儿
    4—9岁：打印：少儿
    10—17岁：打印：少年
    18—45岁：打印：青年
    46—60岁：打印：中年
    60以上：打印：老年
    否则：错误的年龄！
 */
public class Practice_JudgeAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的年龄：");

		int age = sc.nextInt();
		if (age >= 1 && age <= 3) {
			System.out.println("婴儿");
		} else if (age >= 4 && age <= 9) {
			System.out.println("少儿");
		} else if (age >= 10 && age <= 17) {
			System.out.println("少年");
		} else if (age >= 18 && age <= 45) {
			System.out.println("青年");
		} else if (age >= 46 && age <= 60) {
			System.out.println("中年");
		} else if (age >= 60 && age <= 100) {
			System.out.println("老年");
		} else {
			System.out.println("错误的年龄！");
		}
		sc.close();
	}
}
