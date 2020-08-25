package com.loto.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 20:00
 * PageName：b_Annotation_Custom.java
 * Function：自定义注解
 */

// 元注解
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface b_Annotation_Custom {
    // 定义带有属性的注解
    // 格式1：注解的属性类型 属性名称();
    String name();

    // 格式2： 修饰符 返回值类型 属性名() [default 默认值];
    int age() default 28; // 默认值28
}
