package com.loto.collections.a2.linkedlist;

import java.util.LinkedList;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 17:34
 * PageName：a_LinkedList_MemberMethod.java
 * Function：LinkedList_成员方法
 */

public class a_LinkedList_MemberMethod {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();

        // 元素添加到链表
        System.out.println("=====元素添加到链表====");
        link.add("ab");
        link.add("cd");

        link.addFirst("TD");  // 添加到链表的开头
        link.addLast("CJ");   // 添加到链表的结尾

        System.out.println(link);

        // 获取链表元素
        System.out.println("=====获取链表元素====");
        String getfirst = link.getFirst();
        String getlast = link.getLast();

        System.out.println(getfirst);
        System.out.println(getlast);

        // 移除链表元素
        System.out.println("====移除链表元素====");
        String removeFirst = link.removeFirst();
        String removeLast = link.removeLast();

        System.out.println(removeFirst);
        System.out.println(removeLast);

        // 判断集合是否为空
        while (!link.isEmpty()) {
            System.out.println(link.pop()); // 弹出集合中的栈顶元素
        }
    }
}
