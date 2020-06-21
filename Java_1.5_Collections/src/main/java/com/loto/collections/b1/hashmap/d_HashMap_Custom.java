package com.loto.collections.b1.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 18:27
 * PageName：d_HashMap_Custom.java
 * Function：HashMap_使用HashMap集合,存储自定义的对象:（1）作为键出现（2）作为值出现
 */

public class d_HashMap_Custom {
	public static void main(String[] args) {
		function1();
		function2();
	}

	// HashMap 存储自定义对象Person，作为键出现
	// 键的对象,是Person类型,值是字符串
	// 保证键的唯一性,存储到键的对象,重写hashCode equals
	private static void function1() {
		HashMap<Person, String> map = new HashMap<>();

		map.put(new Person("a", 20), "里约热内卢");
		map.put(new Person("b", 18), "索马里");
		map.put(new Person("b", 18), "索马里");
		map.put(new Person("c", 19), "百慕大");

		System.out.println("=======keySet遍历============");
		for (Person key : map.keySet()) {
			String value = map.get(key);
			System.out.println(key + "..." + value);
		}

		System.out.println("=======Entry遍历============");
		for (Map.Entry<Person, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "..." + entry.getValue());
		}
	}

	// HashMap 存储自定义的对象Person，作为值出现
	// 键的对象,是字符串,可以保证唯一性
	private static void function2() {
		HashMap<String, Person> map = new HashMap<>();

		map.put("beijing", new Person("a", 20));
		map.put("tianjin", new Person("b", 18));
		map.put("shanghai", new Person("c", 19));

		System.out.println("=======keySet遍历============");
		for (String key : map.keySet()) {
			Person value = map.get(key);
			System.out.println(key + "..." + value);
		}

		System.out.println("=======Entry遍历============");
		for (Map.Entry<String, Person> entry : map.entrySet()) {
			String key = entry.getKey();
			Person value = entry.getValue();
			System.out.println(key + "..." + value);
		}
	}
}
