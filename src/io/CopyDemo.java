package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用IO 记性文件读写
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        // 写入的文件
        FileOutputStream fos  = new FileOutputStream("fos_copy.txt");
        // 读取的文件
        FileInputStream fis  = new FileInputStream("fos.txt");

        byte[] data = new byte[32];
        int len;
        long start = System.currentTimeMillis();
        while ((len = fis.read(data))!=-1 ){
            data = new String(data,0,len,"UTF-8").getBytes();
            fos.write(data, 0, len);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);






    }
}
