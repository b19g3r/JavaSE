package homework.T03SE.day02;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 要求用户输入一个文件名，并复制当前目录中该文件，并取名为"原文件名_copy.后缀名"
 * 定义两个方法分别使用单字节形式复制，以及字节数组形式复制
 * @author ElaineSui
 *
 */
public class Test07 {
    public static void main(String[] args) throws IOException {
        copy1("1.txt");
        copy2("2.txt");


    }
    /**
     * 使用单字节方式复制
     * @param name 要复制的文件名
     */
    public static void copy1(String name) throws IOException {
        RandomAccessFile old = new RandomAccessFile(name, "r");
        RandomAccessFile newer = new RandomAccessFile(name+"_copy", "rw");
        int d = -1;		// 保存没此读取到的字节

        while ((d = old.read()) != -1) {
            newer.write(d);
        }
        System.out.println("Done");
        old.close();
        newer.close();

    }
    /**
     * 使用字节数组形式复制
     * @param name 要复制的文件名
     */
    public static void copy2(String name) throws IOException {
        RandomAccessFile old = new RandomAccessFile(name, "r");
        RandomAccessFile newer = new RandomAccessFile(name+"_copy", "rw");

        byte[] data = new byte[10];

        int len = -1;		// 每次实际读取到的字节数

        if ((len = old.read(data)) != -1) {
            newer.write(data, 0, len);
        }
        System.out.println("Done");


    }
}
