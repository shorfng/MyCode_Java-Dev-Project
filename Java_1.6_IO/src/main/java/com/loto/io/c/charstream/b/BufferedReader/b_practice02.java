package com.loto.io.c.charstream.b.BufferedReader;

import com.loto.io.c.charstream.a.BufferedWriter.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*把上一题的文本文件中的学生信息读取出来存储到集合中，然后遍历集合，在控制台输出

思路：
创建集合，用来存储读取到的信息
创建br对象
读取文件、获取信息、组成对象、添加到集合
关闭资源 
遍历集合，打印学生信息
*/
public class b_practice02 {
    public static void main(String[] args) throws IOException {
        // 创建集合，用来存储读取到的信息
        ArrayList<Student> list = new ArrayList<>();

        // 创建br对象
        BufferedReader br = new BufferedReader(new FileReader("Java_1.6_IO/src/main/resources/BufferedWriter_student.txt"));

        // 读取文件、获取信息、组成对象、添加到集合
        String line;
        while ((line = br.readLine()) != null) {
            // 字符串切割，切割成各个字段，组成数组
            String[] str = line.split(",");

            // 把切割的数组组成对象
            Student s = new Student(str[0], str[1], str[2], str[3]);

            // 把对象添加到集合
            list.add(s);

        }

        // 关闭资源
        br.close();

        // 遍历集合，打印学生信息
        for (Student s : list) {
            System.out.println(s.getId() + "," + s.getName() + "," + s.getAge() + "," + s.getAddress());
        }
    }
}
