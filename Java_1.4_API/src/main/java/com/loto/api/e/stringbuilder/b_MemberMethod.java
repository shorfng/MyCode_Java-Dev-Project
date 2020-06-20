package com.loto.api.e.stringbuilder;

/**
 * Author：蓝田_Loto
 * PageName：com.loto.dateformat.b_MemberMethod.java
 * Function：StringBuilder_常用成员方法
 */

/*
 public int capacity()                  容器的容量
 public int length()                    容器实际存储的字符个数
 public StringBuilder append(任意类型)   添加数据，并返回自身对象
 public StringBuilder reverse()         反转容器中的内容
 */

public class b_MemberMethod {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcd");

		System.out.println(sb.capacity()); // 20（默认16）
		System.out.println(sb.length());   // 4

        System.out.println("====================================");

        StringBuilder sb1 = new StringBuilder();
        System.out.println("sb1 = " + sb1); // sb1 =

        StringBuilder sb2 = sb1.append("hi");
        System.out.println("sb2 = " + sb2); // sb2 = hi

        sb1.append(10);
        sb1.append(true);
        System.out.println("sb1 = " + sb1); // sb1 = hi10true
        System.out.println("sb2 = " + sb2); // sb2 = hi10true

        // 链式编程
        sb1.append(111).append("hello").append(3.14).append(false);
        System.out.println("sb1 = " + sb1); // sb1 = hi10true111hello3.14false

        // 反转容器中的内容
        sb1.reverse();
        System.out.println("sb1 = " + sb1); // sb1 = eslaf41.3olleh111eurt01ih
	}
}
