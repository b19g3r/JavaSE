/**
 * @Package: io @author: Shane  	@date: 2018年4月9日 上午11:46:51
 * Usage:
 */
package io;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后,要求用户输入文件名,然后对该文件进行 写操作
 * 按行,将用户输入的字串 保存到文件中.
 * 输入 exit 时,程序退出
 * <p>
 * 用 pw 实现.用流连接形式创建
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名");
        String name = sc.nextLine().trim();
        /**
         * PrintWriter 的构造方法中 若第一个参数为流,那么就支持一个重载构造方法,
         * 允许传入 boolean autoFlush .若为true,则具有自动行刷新功能.
         * 即,每次用println 方法写出一行字符串后就会自动 flush
         */
        PrintWriter pw = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(
                                new FileOutputStream(name),
                                "UTF-8"
                        )
                ), true
        );
        System.out.println("Please Input :");
        while (true) {
            String data = sc.nextLine();
            /**
             * Object 的equals方法容易抛空指针异常.
             * 应使用常量或确定有值的对象来调用equals.
             */
            if ("exit".equals(data)) {
                break;
            }
            pw.println(data);
            pw.flush();

        }
        System.out.println("bye");
        pw.close();

    }
}
