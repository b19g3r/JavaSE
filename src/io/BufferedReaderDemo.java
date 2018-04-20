package io;

import java.io.*;

/**
 * @PackageName: io
 * @ClassName: BUfferedReaderDemo
 * @Description: 缓冲字符输入流,按行读取字符串
 * @Author: Shane
 * @Date: 2018/4/914:42
 **/

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/io/BufferedReaderDemo.java");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        /**
         * public String readLine()
         *                 throws IOException
         * 读取一个文本行。通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行。
         * 返回：
         * 包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
         * 抛出：
         * IOException - 如果发生 I/O 错误
         */
        String s = null;
        while ((s = br.readLine() )!= null) {
            System.out.println(s);
        }
    }
}
