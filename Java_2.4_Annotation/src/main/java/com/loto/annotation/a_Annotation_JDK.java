package com.loto.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 19:54
 * PageName：a_Annotation_JDK.java
 * Function：JDK提供的注解
 */

// all：忽略所有警告
@SuppressWarnings("all")
public class a_Annotation_JDK {
    // null：忽略空指针警告
    @SuppressWarnings("null")
    public static void main(String[] args) {
        // unused：忽略未使用警告   rawtypes：忽略泛型警告
        @SuppressWarnings({"unused", "rawtypes"})
        List list = new ArrayList();
        String str = null;
        str.toString();

        show();
    }

    // serial：忽略没有生成序列号的警告
    @SuppressWarnings("serial")
    class b_Annotation_JDK implements java.io.Serializable {

    }

    // 方法过时
    @Deprecated
    public static void show() {
        System.out.println("方法过时");
    }

    // 告知编译器此方法是覆盖父类的
    @Override
    public String toString() {
        System.out.println("覆盖父类方法");
        return super.toString();
    }
}
