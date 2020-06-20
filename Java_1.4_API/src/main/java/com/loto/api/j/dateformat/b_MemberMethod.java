package com.loto.api.j.dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author：蓝田_Loto
 * Date：2018-11-29 22:52
 * PageName：b_MemberMethod.java
 * Function：成员方法
 */

/* 日期格式
* yyyy 年份
* MM   月份
* dd   月中的天数
* HH   0-23小时
* mm   小时中的分钟数
* ss   秒
*/

/*
* [String] format(Date date)   将日期对象转换成字符串（Date -> String format）
* [Date] parse(String source)  子类对象调用父类方法，将字符串解析为日期对象（String -> Date parse）
*/

public class b_MemberMethod {
    public static void main(String[] args) throws ParseException {
        // 1、创建SimpleDateFormat对象，在类的构造方法中写入字符串的日期格式（自定义格式）
        SimpleDateFormat sd1 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");

        // 2、[String] format(Date date)   将日期对象转换成字符串（Date -> String format）
        String s = sd1.format(new Date());
        System.out.println(s);   // 2017年07月12日16时41分47秒

        System.out.println("==========================================================");

        // 1、创建SimpleDateFormat对象，在构造方法中指定日期格式
        SimpleDateFormat sd2 = new SimpleDateFormat("yyy-MM-dd");

        // 2、[Date] parse(String source)  子类对象调用父类方法，将字符串解析为日期对象（String -> Date parse）
        Date d = sd2.parse("2000-1-1");
        System.out.println(d); // Sat Jan 01 00:00:00 CST 2000
    }
}
