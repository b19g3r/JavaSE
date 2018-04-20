package io;
/*
  对象流是一种高级流,可以方便的将Java任何对象进行读写操作

  java.io.ObjectOutputStream
  对象输出流,可将对象转换成一组=字节写出

  java.io.ObjectInputStream
  对象输入流,可以读取一组字节,将其还原为对象.
  前提是读取的字节是对象输出流将一个对象转换成的字节
 */

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用该类测试对象流的对象读写操作
 *
 * 需要注意,若当前类的实例希望能被对象流读写,那么要求该类实现 java.io.Serializable 接口
 */
public class Person implements Serializable {
	/**
	 * 当一个实现了类实现了Serializable 接口后,应当定义一个常量,serialVersionUID
	 * 序列化版本号影响反序列化时是否成功.当对象输入流在进行反序列化是会对比该对象与当前版本号是否一致.一致则成功,否则抛出异常.
	 * 若我们没有指定版本号,编译器会在编译时按照当前类的结构生成一个.但是,这样做会导致当前类发生改变,那么版本号一定会变,这样就无法控制反序列化规则
	 */
	// 默认生成的版本号
	private static final long serialVersionUID = 1L;
	
    private String name;
    private String gender;
    private int age;
    private transient String[] otherInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return name + '\'' + gender + '\'' + age + Arrays.toString(otherInfo);
    }

    /** 
     *@Description:
     *@Parm: [str, n, mail, flag, file]
     *@Return: int
     *@Throws:         
     *@Author: Shane
     *@Date: 2018/4/819:35
     **/
    public int test(String str, int n, double mail, boolean flag, File file) throws IOException {
        file.createNewFile();
        return n;
    }
}

