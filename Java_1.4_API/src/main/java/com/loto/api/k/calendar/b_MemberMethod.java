package com.loto.api.k.calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * Author：蓝田_Loto
 * Date：2018-11-29 23:22
 * PageName：b_MemberMethod.java
 * Function：成员方法
 */

/*
 * [void] set(int year, int month, int date)    设置日历字段YEAR、MONTH和DAY_OF_MONTH的值
 * [void] set(int field, int value)             将给定的日历字段设置为给定值
 * abstract [void] add(int field, int amount)   日历的偏移量，可以指定一个日历中的字段，进行整体偏移
 * [Date] getTime()                             把日历对象转成Date日期对象
 */

public class b_MemberMethod {
    public static void main(String[] args) {
        // 静态方法 getInstance() 直接返回了子类的对象，不需要new
        Calendar c = Calendar.getInstance(); // 返回当前时间

        setAndgetMehod1(c);
        setAndgetMehod2(c);
        addMethod(c);
        getTimeMethod(c);
    }

    // 1、[void] set(int year, int month, int date)  设置日历字段YEAR、MONTH和DAY_OF_MONTH的值
    private static void setAndgetMehod1(Calendar c) {
        c.set(2022, Calendar.JANUARY, 1);

        // Calendar类的set方法：获取日历字段的值
        int year = c.get(Calendar.YEAR);         // 获取年份
        int month = c.get(Calendar.MONTH) + 1;   // 获取月份（需要+1，因为0-11月）
        int day = c.get(Calendar.DAY_OF_MONTH);  // 获取天数

        System.out.println(year + "年" + month + "月" + day + "日"); // 2022年1月1日
    }

    // 2、[void] set(int field, int value)  将给定的日历字段设置为给定值
    private static void setAndgetMehod2(Calendar c) {
        c.set(Calendar.MONTH, 8);  // 设置月份

        int months = c.get(Calendar.MONTH) + 1; // 获取月份（需要+1，因为0-11月）
        System.out.println(months);  // 9
    }

    // 3、abstract [void] add(int field, int amount)  日历的偏移量，可以指定一个日历中的字段，进行整体偏移
    private static void addMethod(Calendar c) {
        c.add(Calendar.DAY_OF_MONTH, 1); // 天数向后偏移1天
        // Practice01_birthday.add(Calendar.DAY_OF_MONTH, -1);    // 天数向前偏移1天

        // Calendar类的set方法：获取日历字段的值
        int year = c.get(Calendar.YEAR);        // 获取年份
        int month = c.get(Calendar.MONTH) + 1;  // 获取月份（需要+1，因为0-11月）
        int day = c.get(Calendar.DAY_OF_MONTH); // 获取天数

        System.out.println(year + "年" + month + "月" + day + "日"); // 2017年7月18日
    }

    // 4、[Date] getTime()  把日历对象转成Date日期对象
    private static void getTimeMethod(Calendar c) {
        Date d = c.getTime();
        System.out.println(d);  // Mon Jul 17 14:49:15 CST 2017
    }
}
