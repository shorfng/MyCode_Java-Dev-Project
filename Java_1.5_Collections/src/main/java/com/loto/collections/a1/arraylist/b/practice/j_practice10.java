package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;

/*
1)	实例化一个只存储Dog对象的ArryayList集合；
2)	向集合中添加三个Dog对象：
    “金毛”,		’公’,		2
    “哈士奇”,	’公’,		1
    “藏獒”,		‘母’,		3
3)	再次向集合中添加一个Dog对象
    “哈士奇”,	‘公’,		1
4)	遍历集合，打印每个Dog对象，观察是否存储了两个”相同的对象”；
5)	如果希望不存储”相同的对象”，应该怎么做？
 */
public class j_practice10 {
	public static void main(String[] args) {
		ArrayList<Dog> list = new ArrayList<>();

		list.add(new Dog("金毛", "公", 2));
		list.add(new Dog("哈士奇", "公", 1));
		list.add(new Dog("藏獒", "母", 3));

		list.add(new Dog("哈士奇", "公", 1));

        for (Dog d : list) {
            System.out.println("姓名：" + d.getName() + "\t" + "性别:" + d.getSex() + "\t" + "年龄：" + d.getAge());
        }

	}

}
