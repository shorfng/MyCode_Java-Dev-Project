package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;

/*
 给定一个字符串数组：{“张三丰”,“宋远桥”,“张无忌”,“殷梨亭”,“张翠山”,“莫声谷”}
 将数组中的元素添加到集合中，并把所有姓张的人员打印到控制台上
 */
public class a_practice1 {
	public static void main(String[] args) {
		// 1、使用string数组存储数据
		String[] arr = { "张三丰", "宋远桥", "张无忌", "殷梨亭", "张翠山", "莫声谷" };

		// 2、创建arrylist集合
		ArrayList<String> list = new ArrayList<>();

		// 3、遍历数组获取元素，并把元素添加到集合中
        for (String s1 : arr) {
            list.add(s1);
        }

		// 4、遍历集合，判断元素是否以“张”开头，如果是就打印
        for (String s : list) {
            if (s.startsWith("张")) {
                System.out.println(s);
            }
        }
	}
}
