package com.loto.collections.a.collection.a.use;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Author：蓝田_Loto
 * Date：2018-12-04 22:43
 * PageName：b_Collection_MemberMethod.java
 * Function：Collection的常用成员方法
 */

/*
* [boolean] add(E e)             确保 collection 包含指定的元素（可选操作）
* [boolean] contains(Object o)   如果 collection 包含指定的元素，则返回 true
* [boolean] remove(Object o)     从 collection 中移除指定元素的单个实例，如果存在的话（可选操作）
* Object[] toArray()             返回包含 collection 中所有元素的数组
* [void] clear()                 移除 collection 中的所有元素（可选操作）
*/

public class b_Collection_MemberMethod {
    public static void main(String[] args) {
        // Collection接口多态的方式调用
        Collection<String> collection = new ArrayList<>();

        // [boolean] add(E e)   确保 collection 包含指定的元素（可选操作）
        System.out.println("======1、向集合中添加元素 ======");
        collection.add("abc");
        collection.add("def");
        System.out.println(collection);

        // [boolean] contains(Object o)   如果 collection 包含指定的元素，则返回 true
        System.out.println("======2、是否包含元素 ======");
        boolean b1 = collection.contains("ab");
        System.out.println(b1);

        // [boolean] remove(Object o)   从 collection 中移除指定元素的单个实例，如果存在的话（可选操作）
        System.out.println("======3、移除指定元素 ======");
        boolean b2 = collection.remove("a");
        System.out.println(b2);

        // Object[] toArray()   返回包含 collection 中所有元素的数组
        System.out.println("======4、把集合转成数组 ======");
        Object[] objects = collection.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

        // [void] clear()  移除 collection 中的所有元素（可选操作）
        System.out.println("======5、清空元素 ======");
        collection.clear();
        System.out.println(collection);
    }
}
