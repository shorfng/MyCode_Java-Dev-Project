package com.loto.collections.a.collection.b.genericity;

import java.util.ArrayList;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 19:15
 * PageName：a_Genericity.java
 * Function：泛型
 */

public class a_Genericity {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();

        array.add(123);
        array.add(456);

        // ArrayList中的方法： <T> T[] toArray(T[] a)
        Integer[] i = new Integer[array.size()];
        Integer[] j = array.toArray(i);

        for (Integer k : j) {
            System.out.println(k);
        }
    }
}
