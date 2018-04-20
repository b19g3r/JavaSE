package homework.T03SE.day02;

import java.io.File;
import java.io.IOException;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。
 * 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 * @author ElaineSui
 *
 */
public class Test02 {
    public static void main(String[] args) throws IOException {

        // 循环实现
        File f = new File("./test.txt");
        newFile:
        if (f.exists()) {
            System.out.println("This file is already exists.");
            int i = 1;
            while (true) {
                String fileName = "./test_副本"+i+".txt";
                File fNew = new File(fileName);
                if(fNew.exists()) {
                    i++;
                } else {
                    fNew.createNewFile();
                    System.out.println("Created a file: "+fNew.getName());
                    break newFile;
                }
            }
        } else {
            f.createNewFile();
            System.out.println("Created a file"+f.getName());
        }

//        // 递归实现
//        File f = new File("./test.txt");
//        creatNewFile(f);
    }

//    private static void creatNewFile(File f ) throws IOException {
//        if (f.exists()) {
//            System.out.println(f.getName()+"is already exists.");
//            int i=1;
//            File fNew = new File("test_副本"+(i++)+".txt");
//            fNew.createNewFile();
//        }
//        return;
//    }
}
