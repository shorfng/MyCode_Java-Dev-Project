package com.loto.collections.b1.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 18:27
 * PageName：b_HashMap_Ergodic_keyset.java
 * Function：HashMap_遍历（keyset）
 */

public class b_HashMap_Ergodic_keyset {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);

		// 1、调用map集合的方法keySet，所有的键存储到Set集合中
		Set<String> set = map.keySet();

		// 2、遍历键的Set集合，获取Set集合中的所有元素（map中的键）

		// 方式1
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String key = it.next(); // it.next()返回的就是set集合元素，即map中的键

			// 3、调用map集合中的方法get，根据键，获取键所对应的值
			Integer value = map.get(key);
			System.out.println(key + "  " + value);
		}

		// 方式2
//		for (String key : set) {
//			// 3、调用map集合中的方法get，根据键，获取键所对应的值
//			Integer value = map.get(key);
//			System.out.println(key + " " + value);
//		}

	}
}
