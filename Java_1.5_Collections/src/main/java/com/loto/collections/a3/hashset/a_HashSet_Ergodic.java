package com.loto.collections.a3.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 17:34
 * PageName：a_HashSet_Ergodic.java
 * Function：HashSet_遍历
 */

public class a_HashSet_Ergodic {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		set.add("abc");
		set.add("def");
		set.add("ghi");

		Iterator<String> it = set.iterator();

		// 遍历后，set是无序打印
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
		}

		System.out.println("============");

		// 增强for遍历
		for (String string : set) {
			System.out.println(string);
		}
	}
}
