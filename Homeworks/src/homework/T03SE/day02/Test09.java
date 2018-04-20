package homework.T03SE.day02;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * 创建一个文件"note.txt",然后通过控制台输入的每一行字符串都按行写入到
 * note.txt中。当输入的字符串为"exit"时退出程序。
 * @author ElaineSui
 *
 */
public class Test09 {


    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("note.txt","rw");
        raf.seek(raf.length());
        Scanner sc = new Scanner(System.in);
        String note = sc.nextLine();
        while ( !"exit".equals(note) ) {
            note = note + "\n";
            byte[] ca = note.getBytes();
            raf.write(ca);
            note = sc.nextLine();
        }
    }
}
