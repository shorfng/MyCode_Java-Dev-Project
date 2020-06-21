package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;

/* 存储自定义对象并遍历
0、定义学生类，描述学生信息
1、创建对象，组织散装数据
2、创建集合存储对象
3、遍历集合，打印学生信息
*/
public class c_practice3 {
	public static void main(String[] args) {
		// 1、创建对象，组织散装数据
        Student s1 = new Student("学生1", "18");
        Student s2 = new Student("学生2", "17");
        Student s3 = new Student("学生3", "16");

		// 2、创建集合存储对象
		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		// 3、遍历集合，打印学生信息
        for (Student s : list) {
            System.out.println(s.getName() + " " + s.getAge());
        }
	}
}
