package com.loto.collections.b2.linkedhashmap;

import java.util.LinkedHashMap;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 19:01
 * PageName：a_LinkedHashMap.java
 * Function：LinkedHashMap继承HashMap,保证迭代的顺序
 */

public class a_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> link = new LinkedHashMap<>();

        link.put("1", "a");
        link.put("13", "a");
        link.put("15", "a");
        link.put("17", "a");

        System.out.println(link);
    }
}
