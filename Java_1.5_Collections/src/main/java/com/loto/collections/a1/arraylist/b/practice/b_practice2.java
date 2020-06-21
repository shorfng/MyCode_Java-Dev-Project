package com.loto.collections.a1.arraylist.b.practice;

/* 对象数组的案例
 创建一个学生数组，存储三个学生对象并遍历
 0、创建学生类，用于描述学生 ---- Student
 1、创建3个学生对象，组织散装数据
 2、创建学生数组，把3个对象添加到数组中 ---- Student[] arr；
 3、遍历数组，打印学生信息
 */
public class b_practice2 {

	public static void main(String[] args) {
		// 1、创建3个学生对象，组织散装数据
		Student s1 = new Student("学生1", "18");
		Student s2 = new Student("学生2", "17");
		Student s3 = new Student("学生3", "16");

		// 2、创建学生数组，把3个对象添加到数组中
		Student[] arr = new Student[3];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;

		// 3、遍历数组，打印学生信息
        for (Student temp : arr) {
            System.out.println(temp.getName() + " " + temp.getAge());
        }
	}
}
