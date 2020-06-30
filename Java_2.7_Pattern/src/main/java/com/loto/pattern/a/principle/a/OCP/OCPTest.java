package com.loto.pattern.a.principle.a.OCP;

/**
 * Author：蓝田_Loto
 * Date：2019-07-05 13:48
 * PageName：OpenCloseTest.java
 * Function：开闭原则测试类
 */

public class OCPTest {
    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaCourse(1, "java架构课程", 18888.00);
        System.out.println("课程id：" + javaCourse.getId());
        System.out.println("课程标题：" + javaCourse.getName());
        System.out.println("价格：" + javaCourse.getPrice());

        System.out.println("==================================");

        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(2, "java架构课程（打折）", 18888.00);
		System.out.println("课程id：" + javaDiscountCourse.getId());
		System.out.println("课程标题：" + javaDiscountCourse.getName());
		System.out.println("原始价格：" + javaDiscountCourse.getOriginPrice());
        System.out.println("折后价格：" + javaDiscountCourse.getDiscountPrice());
    }
}
