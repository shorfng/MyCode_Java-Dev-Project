package com.loto.collections.a.collection.a.use;

import java.util.*;

/**
 * Author：蓝田_Loto
 * Date：2018-12-04 22:20
 * PageName：a_Collection_Struct.java
 * Function：集合的类层次结构
 */

public class a_Collection_Struct {
    public static void main(String[] args) {
        System.out.println("================== ArrayList =====================");
        ArrayList();  // 有序、有索引、可重复(底层：数组)

        System.out.println("=================== LinkedList ===================");
        LinkedList(); // 有序、有索引、可重复（底层：双向链表）

        System.out.println("====================== HashSet ===================");
        HashSet();    // 无序、不允许重复

        System.out.println("==================== HashMap =====================");
        HashMap();    // 无序、不允许重复
    }

    private static void ArrayList() {
        List<String> a1 = new ArrayList<>();

        a1.add("Program");
        a1.add("Creek");
        a1.add("Java");
        a1.add("Java");

        System.out.println("ArrayList Elements");
        System.out.print("\t" + a1 + "\n");
    }

    private static void LinkedList() {
        List<String> l1 = new LinkedList<>();

        l1.add("Program");
        l1.add("Creek");
        l1.add("Java");
        l1.add("Java");

        System.out.println("LinkedList Elements");
        System.out.print("\t" + l1 + "\n");
    }

    private static void HashSet() {
        Set<String> s1 = new HashSet<>();

        s1.add("Program");
        s1.add("Creek");
        s1.add("Java");
        s1.add("Java");
        s1.add("tutorial");

        System.out.println("HashSet Elements");
        System.out.print("\t" + s1 + "\n");
    }

    private static void HashMap() {
        Map<String, String> m1 = new HashMap<>();

        m1.put("Windows", "2000");
        m1.put("Windows", "XP");
        m1.put("Language", "Java");
        m1.put("Website", "shorfng.com");

        System.out.println("HashMap Elements");
        System.out.print("\t" + m1);
    }
}
