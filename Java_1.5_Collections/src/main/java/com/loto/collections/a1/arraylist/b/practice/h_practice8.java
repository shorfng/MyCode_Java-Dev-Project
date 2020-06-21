package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;

/*
1)	实例化一个Person对象p1；
2)	为p1的各个属性赋值；
3)	打印p1的各个属性值；
4)	实例化第二个Person对象p2;
5)	为p2的各个属性赋值；
6)	打印p2的各个属性值；
7)  然后将p1和p2 对象存进一个集合中，然后遍历这个集合，将所有的对象的信息打印出来。
 */
public class h_practice8 {
	public static void main(String[] args) {
		// 实例化一个Person对象p1，为p1的各个属性赋值
		Person p1 = new Person();
		p1.setName("张三");
		p1.setSex("男");
		p1.setAge(18);
		p1.setId("123456789123456789");
		p1.setHeight(180);
		p1.setWeigh(130);

		// 打印p1的各个属性值
		System.out.println(p1.getName());
		System.out.println(p1.getSex());
		System.out.println(p1.getAge());
		System.out.println(p1.getId());
		System.out.println(p1.getHeight());
		System.out.println(p1.getWeigh());

		System.out.println("===============");

		// 实例化第二个Person对象p2，为p2的各个属性赋值；
		Person p2 = new Person();
		p2.setName("李四");
		p2.setSex("女");
		p2.setAge(17);
		p2.setId("1234567812345678");
		p2.setHeight(175);
		p2.setWeigh(100);

		// 打印p2的各个属性值
		System.out.println(p2.getName());
		System.out.println(p2.getSex());
		System.out.println(p2.getAge());
		System.out.println(p2.getId());
		System.out.println(p2.getHeight());
		System.out.println(p2.getWeigh());

		System.out.println("===============");

		// 将p1和p2 对象存进一个集合中。
		ArrayList<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);

		// 然后遍历这个集合，将所有的对象的信息打印出来
        for (Person p : list) {
            System.out.println("姓名：" + p.getName());
            System.out.println("性别：" + p.getSex());
            System.out.println("年龄：" + p.getAge());
            System.out.println("身份证号：" + p.getId());
            System.out.println("身高：" + p.getHeight());
            System.out.println("体重：" + p.getWeigh());
        }
	}
}
