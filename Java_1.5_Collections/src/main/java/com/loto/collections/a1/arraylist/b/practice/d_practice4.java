package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;
import java.util.Scanner;

// 创建一个集合，存储学生对象，学生对象的数据来自于键盘录入，最后，遍历集合
public class d_practice4 {

	public static void main(String[] args) {
		// 创建集合，用来存储学生信息
		ArrayList<Student> list = new ArrayList<>();

		// 使用scanner获取键盘录入
		Scanner sc = new Scanner(System.in);

		// 循环录入信息，存入集合
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入名字：");
			String name = sc.next();

			System.out.println("请输入年龄：");
			String age = sc.next();

			Student s = new Student(name, age);
			list.add(s);
		}

		// 遍历集合
        for (Student ss : list) {
            System.out.println(ss.getName() + " " + ss.getAge());
        }
		sc.close();
	}
}
