package homework.T03SE.day02;

import java.io.File;
import java.io.IOException;

/**
 * 要求用户输入一个目录名并使用File在当前目录下创建出来。
 * 若该目录已经存在，则提示用户该目录已经存在。并创建副本，原则与第二题一致。
 * @author ElaineSui
 *
 */
public class Test03 {
    public static void main(String[] args) {
        File file = new File("./test");
        if (file.exists()) {
            System.out.println(file.getName()+" already exists");
            int i = 1;
            while (true) {
                File fN = new File("./test_副本"+i+".txt");
                if (fN.exists()) {
                    i++;
                } else {
                    fN.mkdir();
                    return;
                }
            }
        } else {
            file.mkdir();
        }
    }
}
