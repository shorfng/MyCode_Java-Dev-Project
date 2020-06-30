package com.loto.pattern.a.principle.a.OCP;

/**
 * Author：蓝田_Loto
 * Date：2019-07-05 13:44
 * PageName：JavaDiscountCourse.java
 * Function：java课程打折类（继承java课程类：JavaCourse）
 */

public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    // 得到原始价格
    public Double getOriginPrice() {
        return super.getPrice();
    }

    // 得到打折价格
    public Double getDiscountPrice() {
        return super.getPrice() * 0.61;
    }
}
