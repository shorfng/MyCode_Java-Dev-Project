package com.loto.collections.a1.arraylist.a.useage;

import java.util.ArrayList;

/**
 * Author：蓝田_Loto
 * Date：2018-12-04 23:27
 * PageName：a_ArrayList_Create.java
 * Function：ArrayList_创建方式及类型
 */

/*
   byte | Byte
  short | Short
    Int | Integer
   long | Long
   float| Float
 double | Double
   char | Character
boolean | Boolean
*/

public class a_ArrayList_Create {
    public static void main(String[] args) {
        // 1、创建一个集合，可以存储字符串对象
        ArrayList<String> list0= new ArrayList<String>(); // 写法1
        ArrayList<String> list1 = new ArrayList<>();      // 写法2

        // 2、创建一个集合，存储 byte 类型
        ArrayList<Byte> list2 = new ArrayList<>();

        // 3、创建一个集合，存储 short 类型
        ArrayList<Short> list3 = new ArrayList<>();

        // 4、创建一个集合，存储 int 类型
        ArrayList<Integer> list4 = new ArrayList<>();

        // 5、创建一个集合，存储 long 类型
        ArrayList<Long> list5 = new ArrayList<>();

        // 6、创建一个集合，存储 float 类型
        ArrayList<Float> list6 = new ArrayList<>();

        // 7、创建一个集合，存储 double 类型
        ArrayList<Double> list7 = new ArrayList<>();

        // 8、创建一个集合，存储 char 类型
        ArrayList<Character> list8 = new ArrayList<>();

        // 9、创建一个集合，存储 boolean 类型
        ArrayList<Boolean> list9 = new ArrayList<>();
    }
}
