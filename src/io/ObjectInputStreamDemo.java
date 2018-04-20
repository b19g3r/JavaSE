package io;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @PackageName: IO
 * @ClassName: ObjectInputStreamDemo
 * @Description: 使用对象输入流完成对象反序列化
 * @Author: Shane
 * @Date: 2018/4/817:49
 **/

public class ObjectInputStreamDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Person p = (Person) ois.readObject();
        System.out.println(p);



    }
}
