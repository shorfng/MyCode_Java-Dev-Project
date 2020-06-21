package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;
import java.util.Scanner;

/* 编写一个程序的模拟班级学生的成绩库, 包含成绩:英语,数学,Java
实现如下功能：
1.可以修改某个学生的某项分数. 
2.可以打印全班同学成绩
要求使用集合来完成.
 */
public class m_practice13 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();

		list.add(new Student("张三", 99, 90, 100));
		list.add(new Student("李四", 89, 80, 100));

		// 显示成绩
		show(list);

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();

		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			// 如果集合有相同的姓名，则继续修改其他信息
			if (s.getName().equals(name)) {
				System.out.println("请输入科目：");
				String kemu = sc.nextLine();

				System.out.println("请输入分数：");
				double score = sc.nextDouble();

				// 根据不同的科目,修改不同的分数.
				switch (kemu) {
				case "数学":
					s.setMath(score);
					break;
				case "英语":
					s.setEnglish(score);
					break;
				case "java":
					s.setJava(score);
					break;
				default:
					System.out.println("查无此课, 对不起");
					return;
				}
				System.out.println("恭喜您, 修改成功");

				show(list);
				return;
			}
		}
		sc.close();
		System.out.println("对不起 ,查无此人");
	}

	private static void show(ArrayList<Student> list) {
		System.out.println("学生成绩显示如下：");
        for (Student s : list) {
            System.out.println("姓名：" + s.getName() + "\t"
                             + "英语：" + s.getEnglish() + "\t"
                             + "数学：" + s.getMath() + "\t"
                             + "java：" + s.getJava());
        }
	}

}
