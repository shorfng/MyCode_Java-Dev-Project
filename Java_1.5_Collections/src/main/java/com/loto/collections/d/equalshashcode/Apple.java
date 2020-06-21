package com.loto.collections.d.equalshashcode;

import java.util.HashMap;

/**
 * Author：蓝田_Loto
 * Date：2018-04-26 18:29
 * PageName：Apple.java
 * Function：【区别】equals和hashCode方法
 */

public class Apple {
    private String color;

    private Apple(String color) {
        this.color = color;
    }

    // 解决方案：是将hashCode方法添加到Apple类
    public int hashCode(){
        return this.color.hashCode();
    }

    // 比较
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (!(obj instanceof Apple))
            return false;

        if (obj == this)
            return true;

        return this.color.equals(((Apple) obj).color);
    }

    public static void main(String[] args) {
        Apple a1 = new Apple("green");
        Apple a2 = new Apple("red");

        // hashMap stores apple type and its quantity
        HashMap<Apple, Integer> m = new HashMap<>();
        m.put(a1, 10);
        m.put(a2, 20);

        System.out.println(m.get(new Apple("green")));
    }
}

