package com.loto.io.b.bytestream.d.ObjectInputStream;

import com.loto.io.b.bytestream.c.ObjectOutputStream.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 17:34
 * PageName：a_ObjectInputStream_usage.java
 * Function：ObjectInputStream（反序列化流/向流中写入对象的操作流）
 */

// 获取存储起来的对象
public class a_ObjectInputStream_usage {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 定义流对象关联存储了对象文件
        FileInputStream fis = new FileInputStream("Java_1.6_IO/src/main/resources/ObjectOutputStream.txt");

        // 建立用于读取对象的功能对象
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person obj = (Person) ois.readObject();
        System.out.println(obj.toString());
    }
}
