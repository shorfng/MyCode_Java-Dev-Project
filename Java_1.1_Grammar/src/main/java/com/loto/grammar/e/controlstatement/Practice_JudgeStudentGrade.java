package com.loto.grammar.e.controlstatement;

import java.util.Scanner;

/*
键盘录入学生考试成绩，判断学生等级：
    90-100 优秀 
    80-90 好 
    70-80 良 
    60-70 及格 
    60 以下 不及格
 */
public class Practice_JudgeStudentGrade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入学生成绩：");
		int grade = sc.nextInt();

		if (grade < 0 || grade > 100) {
			System.out.println("成绩输入错误！！！");
		} else if (grade >= 90) {
			System.out.println("优秀");
		} else if (grade >= 80) {
			System.out.println("好");
		} else if (grade >= 70) {
			System.out.println("良");
		} else if (grade >= 60) {
			System.out.println("及格");
		} else {
			System.out.println("不及格");
		}
		sc.close();
	}
}
