package com.loto.collections.a1.arraylist.a.useage;

import java.util.ArrayList;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 14:28
 * PageName：e_ArrayList_Ergodic.java
 * Function：ArrayList_遍历
 */

public class e_ArrayList_Ergodic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("学生1");
        list.add("学生2");
        list.add("学生3");

        // 遍历
        for (String s : list) {
            System.out.println(s);
        }

        //for (int i = 0; i < list.size(); i++) {
        //    String s = list.get(i);
        //    System.out.println(s);
        //}
    }
}
