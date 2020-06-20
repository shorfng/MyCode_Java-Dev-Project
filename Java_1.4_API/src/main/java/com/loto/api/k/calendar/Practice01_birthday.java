package com.loto.api.k.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * Date：2018-11-30 0:01
 * PageName：Practice01_birthday.java
 * Function：求出自己已经出生多少天
 */

public class Practice01_birthday {
    public static void main(String[] args) throws ParseException {
        birthday1();
        birthday2();
    }

    private static void birthday1() {
        // 1、获取当前时间对应的天数
        Calendar todays = Calendar.getInstance();

        // 2、获取自己出生日期对应的天数 1991-8-30
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 1991);
        c.set(Calendar.MONTH, 7);
        c.set(Calendar.DATE, 30);

        // 3、两个时间相减（当前时间天数 – 出生日期天数）
        int today = todays.get(Calendar.DATE);
        int birthday = c.get(Calendar.DATE);
        System.out.println(today - birthday);
    }

    private static void birthday2() throws ParseException {
        // 1、获取当前时间对应的天数
        Date todayDate = new Date();

        // 2、获取自己出生日期对应的天数
        System.out.println("请输入出生日期：YYYY-MM-dd");
        String birthdayString = new Scanner(System.in).next();             // 获取出生日期，键盘输入
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  // 将字符串日期，转换成date对象
        Date birthdayDate = sdf.parse(birthdayString);                     // 调用parse方法，字符串转换成日期对象

        // 3、将两个日期转成毫秒值（当前时间天数 – 出生日期天数）
        long today = todayDate.getTime();
        long birthday = birthdayDate.getTime();

        // 4、两个时间相减，再转换成天数
        long day = today - birthday;
        if (day < 0) {
            System.out.println("还没出生");
        } else {
            System.out.println("已经出生："+ (day / 1000 / 60 / 60 / 24) + "天");
        }
    }
}
