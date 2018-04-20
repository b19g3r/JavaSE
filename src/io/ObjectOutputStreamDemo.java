package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class ObjectOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        Person p = new Person();
        p.setAge(18);
        p.setName("苍老师");
        p.setGender("女");
        String[] otherInfo = {"是一名演员","爱好是写毛笔字"};
        p.setOtherInfo(otherInfo);
        System.out.println(p);


        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /*
         * 将给定的对象转化成一组字节后写出
         * oos.writeObject 方法在当前案例中,经过了两个流.首先
         * oos:将给定的对象p 转换为了一组字节,这个过程成为序列化
         * foo:oos将对象转换为字节后,将这组字节交给fos写入文件,即写入硬盘长久保存.
         *     该过程称为数据持久化
         */
        oos.writeObject(p);
        System.out.println("Done");
        oos.close();


    }
}
