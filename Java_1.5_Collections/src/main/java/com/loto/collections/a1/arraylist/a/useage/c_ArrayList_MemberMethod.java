package com.loto.collections.a1.arraylist.a.useage;

import java.util.ArrayList;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 13:56
 * PageName：c_ArrayList_MemberMethod.java
 * Function：ArrayList_成员方法
 */

/*
    1、添加元素
	[boolean] add(E e)                 添加元素
    [void] add(int index,E element)    在指定的索引处添加一个元素

    2、获取元素
	[E] get(int index)                 根据索引值获取元素，返回指定索引处的元素

    3、集合长度
    [int] size()                       返回集合中的元素的个数

    4、删除元素
	[boolean] remove(Object o)         删除指定的元素，返回删除是否成功
	[E] remove(int index)              删除指定索引处的元素，返回被删除的元素

    5、修改元素
	[E] set(int index,E element)       使用element去替换指定索引的元素，并返回被替换的元素
 */

public class c_ArrayList_MemberMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("list = " + list); // list = []

        System.out.println("=====1、添加元素=====");
        // 添加元素
        list.add("学生1");
        list.add("学生2");
        list.add("学生3");
        System.out.println("list = " + list); // list = [学生1, 学生2, 学生3]

        System.out.println("=====1、添加元素=====");
        // 在指定的索引处添加一个元素
        list.add(0, "学生0");
        System.out.println("list = " + list); // list = [学生0, 学生1, 学生2, 学生3]

        System.out.println("=====2、获取元素=====");
        // 根据索引值获取元素，返回指定索引处的元素
        System.out.println(list.get(0));

        System.out.println("=====3、集合长度=====");
        // 返回集合中的元素的个数
        System.out.println("list = " + list.size());

        System.out.println("=====4、删除元素=====");
        // 删除指定的元素，返回删除是否成功
        list.remove(0);
        System.out.println("list = " + list.size());
        System.out.println("list = " + list);

        System.out.println("=====4、删除元素=====");
        // 删除指定索引处的元素，返回被删除的元素
        String s = list.remove(1);
        System.out.println("s = " + s);
        System.out.println("list = " + list.size());
        System.out.println("list = " + list);

        System.out.println("=====5、修改元素=====");
        // 使用element去替换指定索引的元素，并返回被替换的元素
        String ss = list.set(0, "TD");
        System.out.println("ss = " + ss);
        System.out.println("list = " + list);

        System.out.println("=====6、清空元素=====");
        list.clear();
        System.out.println(list);
    }
}
