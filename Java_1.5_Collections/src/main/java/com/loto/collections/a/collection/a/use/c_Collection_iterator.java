package com.loto.collections.a.collection.a.use;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Author：蓝田_Loto
 * Date：2018-12-04 22:43
 * PageName：c_Collection_iterator.java
 * Function：Collection_遍历
 */

public class c_Collection_iterator {
	public static void main(String[] args) {
		Collection<String> coll = new ArrayList<>();
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");

		// 方法1：迭代器,对集合ArrayList中的元素进行取出

		// 1、调用集合的方法iterator()获取出,Iterator接口的实现类的对象
		Iterator<String> it1 = coll.iterator();

		// 2、接口实现类对象,调用方法hasNext()判断集合中是否有元素
		// boolean b = it.hasNext();
		// System.out.println(b);

		// 3、接口的实现类对象,调用方法next()取出集合中的元素
		// String s = it.next();
		// System.out.println(s);

		// 2-3、迭代是反复内容,使用循环实现
		// 循环的条件是：集合中没元素, hasNext()返回false
		while (it1.hasNext()) {
			String s = it1.next();// next()方法作用:①返回指向的当前元素 ②指针后移一个元素
			System.out.println(s);
		}

		// 方法2：for循环迭代写法
		for (Iterator<String> it2 = coll.iterator(); it2.hasNext();) {
			System.out.println(it2.next());
		}
	}

}
