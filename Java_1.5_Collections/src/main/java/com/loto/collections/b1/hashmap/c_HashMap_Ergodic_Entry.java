package com.loto.collections.b1.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 18:27
 * PageName：c_HashMap_Ergodic_Entry.java
 * Function：HashMap_遍历（Entry）
 */

public class c_HashMap_Ergodic_Entry {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "ab");
		map.put(2, "cd");
		map.put(3, "ef");

		// 1、调用map集合中的方法entrySet()，将集合中的映射关系对象存储到Set集合中
		Set<Map.Entry<Integer, String>> set = map.entrySet();

		// 2、迭代Set集合
		
		// 方式1
		// Iterator<Map.Entry<Integer, String>> it = set.iterator();
		// while (it.hasNext()) {
		// // 3、获取的Set集合中的元素，是映射关系对象
		// Map.Entry<Integer, String> entry = it.next();
		//
		// // 4、通过映射关系对象的方法getKey、getValue获取键值对
		// Integer key = entry.getKey();
		// String value = entry.getValue();
		// System.out.println(key + " " + value);
		// }

		// 方式2
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

	}
}
