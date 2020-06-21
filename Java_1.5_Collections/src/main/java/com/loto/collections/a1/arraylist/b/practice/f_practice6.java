package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;

/*
1)	实例化一个ArrayList，只存储String数据：
2)	依次存入以下元素：孙悟空，猪八戒，白骨精，红孩儿
3)	遍历集合，取出每个元素并打印；
 */
public class f_practice6 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("孙悟空");
		list.add("猪八戒");
		list.add("白骨精");
		list.add("红孩儿");

        for (String s : list) {
            System.out.println(s);
        }
	}
}
