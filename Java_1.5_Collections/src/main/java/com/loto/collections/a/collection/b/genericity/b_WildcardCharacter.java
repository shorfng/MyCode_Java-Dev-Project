package com.loto.collections.a.collection.b.genericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 19:15
 * PageName：b_WildcardCharacter.java
 * Function：泛型 - 通配符
 */

public class b_WildcardCharacter {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();

		array.add("123");
		array.add("456");

		set.add(789);
		set.add(890);

		iterator(array);
		iterator(set);
	}

	// 同时迭代两个集合，使用泛型的通配符匹配所有的数据类型
	private static void iterator(Collection<?> coll) {
		Iterator<?> it = coll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());  // it.next()获取对象
		}
	}
}
