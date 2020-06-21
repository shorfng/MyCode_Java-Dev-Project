package com.loto.collections.b1.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 18:27
 * PageName：a_HashMap_MemberMethod.java
 * Function：HashMap_成员方法
 */

public class a_HashMap_MemberMethod {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // 1、将键值对存储到集合中
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        map.put("d", 3); // 允许出现重复的value
        Integer i = map.put("d", 5); // 不允许出现重复的key，将覆盖原有的value
        System.out.println(i); // 返回值一般情况下是null，当存储了重复的key时，返回被覆盖之前的value

        System.out.println(map); // {a=1, b=2, c=3, d=5}

        // 2、通过key，拿到对应的值（通过键对象，获取值对象），如果没有这个key，则返回null
        Integer value1 = map.get("a");
        System.out.println(value1);

        // 3、移除集合中的键值对，返回被移除之前的值,如果没有这个key，则返回null
        Integer value2 = map.remove("a");
        System.out.println(map);
        System.out.println(value2);
    }
}
