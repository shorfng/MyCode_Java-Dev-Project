package com.loto.annotation;

import java.lang.reflect.Method;

/**
 * Author：蓝田_Loto
 * Date：2018-12-26 20:00
 * PageName：d_Annotation_analysis.java
 * Function：解析注解（反射）（解析show方法上面的注解）
 */

public class d_Annotation_analysis {
    public static void main(String[] args) throws Exception {
        System.out.println("===== 获取自定义注解中的某一个方法 =====");
        oneMethod();

        System.out.println("===== 获取自定义注解中的所有方法 =====");
        allMethod();
    }

    // 获取自定义注解中的某一个方法
    private static void oneMethod() throws Exception {
        // 1、获得字节码对象
        Class clazz = c_Annotation_use.class;

        // 2、获得show方法上面的注解
        Method method = clazz.getMethod("show", String.class);
        b_Annotation_Custom annotation = method.getAnnotation(b_Annotation_Custom.class);

        // 3、获得注解上的属性值
        System.out.println(annotation.name()); // TD
        System.out.println(annotation.age());  // 20
    }

    // 获取自定义注解中的所有方法
    private static void allMethod() throws Exception {
        // 1、获得类的字节码对象
        Class clazz = c_Annotation_use.class;

        // 2、获得实例对象
        Object object = clazz.newInstance();

        // 3、获得目标类所有的方法
        Method[] allMethod = clazz.getMethods();

        // 4、遍历所有的方法
        for (Method method : allMethod) {
            // 判断该方法是否使用了注解
            boolean flag = method.isAnnotationPresent(b_Annotation_Custom.class);
            if (flag) {
                // 该方法使用注解，则调用该方法
                method.invoke(object, (Object) null);
            }
        }
    }
}
