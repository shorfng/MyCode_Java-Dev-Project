package com.loto.collections.a3.hashset;

import java.util.HashSet;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 17:34
 * PageName：b_HashSet_hashcode.java
 * Function：HashSet_hashcode
 */

public class b_HashSet_hashcode {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();

		set.add(new String("abc"));
		set.add(new String("abc"));

		set.add(new String("def"));
		set.add(new String("def"));

		System.out.println(set); // [abc, def]

		System.out.println("==============");

		// 将Person对象中的姓名、年龄相同数据,看作同一个对象
		// 判断对象是否重复,依赖对象自己的方法 hashCode和equals方法
		HashSet<Person> setPerson = new HashSet<>();

		setPerson.add(new Person("a", 11));
		setPerson.add(new Person("b", 10));
		setPerson.add(new Person("c", 25));
		setPerson.add(new Person("d", 19));

		setPerson.add(new Person("e", 17));
		setPerson.add(new Person("e", 17));

		System.out.println(setPerson);
	}
}
