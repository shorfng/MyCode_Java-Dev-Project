package com.loto.io.b.bytestream.b.FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-22 14:57
 * PageName：b_FileInputStream_readByArray.java
 * Function：读取数据（通过使用字节数组读取文件）
 */

// [int] read(byte[] b)
public class b_FileInputStream_readByArray {
    public static void main(String[] args) throws IOException {
        copyTxt();  // 复制文本文件
        copyPic();  // 复制图片
    }

    // 复制文本文件
    private static void copyTxt() throws IOException {
        // 创建流对象
        FileInputStream fis = new FileInputStream("Java_1.6_IO/src/main/resources/FileOutputStream.txt");
        FileOutputStream fos = new FileOutputStream("Java_1.6_IO/src/main/resources/FileOutputStreamCopy.txt");

        // 定义一个缓冲区
        byte[] b = new byte[2];  // 建议1024的整数倍
        int len;                 // 有效字节数（如果是文件结尾 返回 -1）
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);  // b 表示存数据的数组, 0 表示开始的位置,  len 有效字符个数
        }

        // 关闭资源
        fos.close();
        fis.close();
        System.out.println("复制文件完毕");
    }

    // 复制图片
    private static void copyPic() throws IOException {
        // 创建流对象
        FileInputStream fis = new FileInputStream("Java_1.6_IO/src/main/resources/TD.jpg");
        FileOutputStream fos = new FileOutputStream("Java_1.6_IO/src/main/resources/CJ.jpg");

        // 方案1：一个字符一个字符的复制
        // 问题：每次都从源文件读取一个，然后在写到指定文件，接着再读取一个字符，然后再写一个，一直这样下去。效率极低）
        //int b;
        //while ((b = fis.read()) != -1) {
        //    fos.write(b);
        //}

        // 方案2：临时数组方式复制（高效）
        // 定义一个缓冲区
        byte[] b = new byte[2];  // 建议1024的整数倍
        int len;                 // 有效字节数（如果是文件结尾 返回 -1）
        while ((len = fis.read(b)) != -1) {
            fos.write(b, 0, len);  // b 表示存数据的数组, 0 表示开始的位置,  len 有效字符个数
        }

        fos.close();
        fis.close();
        System.out.println("复制图片完毕");
    }
}
