package com.loto.io.c.charstream.a.BufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
键盘录入3个学生信息(学号,姓名,年龄,居住城市)存入集合
遍历集合把每一个学生信息存入文本文件(每一个学生信息为一行，自己定义分割标记)

思路:
创建学生类，用来描述学生信息
创建集合容器，用来存储学生信息
键盘录入，获取三个学生的信息
组成对象，添加到集合
创建bw对象
遍历集合，获取学生信息，写入到文件
关闭资源
 */
public class c_practice01 {
    public static void main(String[] args) throws IOException {
        // 创建集合容器，用来存储学生信息
        ArrayList<Student> list = new ArrayList<>();

        // 键盘录入，获取三个学生的信息
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("请输入学号：");
            String id = sc.next();
            System.out.println("请输入姓名：");
            String name = sc.next();
            System.out.println("请输入年龄：");
            String age = sc.next();
            System.out.println("请输入居住地：");
            String address = sc.next();

            // 组成对象，添加到集合
            Student s = new Student(id, name, age, address);
            list.add(s);
            System.out.println("完成一个学生信息录入");
        }

        // 创建bw对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("Java_1.6_IO/src/main/resources/BufferedWriter_student.txt"));

        // 遍历集合，获取学生信息，写入到文件
        for (Student s : list) {
            // 使用sb按照指定的格式拼装学生信息
            StringBuilder sb = new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        // 关闭资源
        bw.close();
    }
}
