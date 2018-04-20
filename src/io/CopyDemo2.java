package io;

import java.io.*;

/**
 * java.io.BufferedInputStream
 * java.io.BufferedOutputStream
 *
 * 缓冲流是一种高级流,作用是提高读取效率
 */
public class CopyDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("1.pdf");
        // 将缓冲流连接 在文件流上,提高读文件效率
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("2.pdf");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int d = -1;

        /**
         * 缓冲流实际上就是进行快读写操作.无论我们使用缓冲流进行何种读写方式(随机读写.块读写)
         * 最终都会被缓冲流转换为块读写形式通过文件流进行实际操作.
         * 缓冲流内部维护了一个8K的字节数组 ,用于块读写操作.
         */
        while((d=bis.read())!=-1){
            bos.write(d);
        }

        bis.close();
    }
}
