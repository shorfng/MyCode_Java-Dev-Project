package com.loto.io.b.bytestream.c.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 17:19
 * PageName：a_ObjectOutputStream_usage.java
 * Function：ObjectOutputStream（序列化流/从流中读取对象的操作流）
 */

// 将一个对象存储到持久化(硬盘)的设备上
public class a_ObjectOutputStream_usage {
    public static void main(String[] args) throws IOException {
        // 明确存储对象的文件
        FileOutputStream fos = new FileOutputStream("Java_1.6_IO/src/main/resources/ObjectOutputStream.txt");

        // 给操作文件对象加入写入对象功能
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // 调用了写入对象的方法
        oos.writeObject(new Person("TD",25));

        //关闭资源
        oos.close();
    }
}
