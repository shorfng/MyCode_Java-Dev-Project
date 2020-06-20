package com.loto.oriented.f.inheritance.e.superconstructor;

public class Main {
	public static void main(String[] args) {
		Student stu1 = new Student();

		stu1.setName("CJ");
		stu1.setAge(9);
		stu1.setSex("男");

		System.out.println("姓名：" + stu1.getName());
		System.out.println("年龄：" + stu1.getAge());
		System.out.println("性别：" + stu1.getSex());

		System.out.println("=========================");

		Student stu2 = new Student("TD", 10, "男");
		System.out.println("姓名：" + stu2.getName());
		System.out.println("年龄：" + stu2.getAge());
		System.out.println("性别：" + stu2.getSex());
	}
}

// 打印内容：
// 调用了父类的无参构造器
// 调用了子类的无参构造器
// 姓名：CJ
// 年龄：9
//  =性别：男
//=========================
// 调用了父类的有参构造器
// 调用了子类的有参构造器
// 姓名：TD
// 年龄：10
// 性别：男