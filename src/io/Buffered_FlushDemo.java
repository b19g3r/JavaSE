package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 缓冲区的缓冲流操作
 */
public class Buffered_FlushDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "韩寒会画画后悔画韩红";
        byte[] data = str.getBytes();

        bos.write(data);
        // 强制将当前缓冲区数据写出
//        bos.flush();
        System.out.println("Done");

        // 缓冲流 close 方法会调用 flush.
        bos.close();

    }
}
