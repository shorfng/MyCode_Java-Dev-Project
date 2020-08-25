package com.loto.annotation;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 20:00
 * PageName：c_Annotation_use.java
 * Function：使用注解
 */

public class c_Annotation_use {
    @b_Annotation_Custom(name = "TD", age = 20)
    public void show(String str) {
        System.out.println("show running...");
    }

    @b_Annotation_Custom(name = "CJ", age = 21)
    public void show2(String str) {
        System.out.println("show2 running...");
    }
}
