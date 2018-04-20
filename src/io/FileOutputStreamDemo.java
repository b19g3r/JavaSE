package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * java IO
 *Java 提供了标准的IO 操作,即,输入与输出
 * IO 的作用是可以让我们的程序与外界进行数据交换
 * 例如:从网络读取数据,读取键盘数据,读写文件数据等
 *
 * 标准IO 根据 功能 按方向划分.
 * 输入: 从外界 读
 * 输出: 向外界 写
 *
 * IO 的重点: 理解流连接操作. 通过应用流连接,按照需求组合高级流与低级流,完成读写操作
 *
 * 流分为:  节点流 (低级流)  处理流(高级流)
 * 节点流：实际连接程序与另一端的管道，负责在两端之间传送数据．　
 * 注意：读写一定是建立在节点流的基础上进行的．
 *
 * 处理流：不能独立存在，可以连接在其流上，处理流自带某种对数据的加工操作．
 * 所以数据流经会对这些数据进行处理，这样可以简化我们队数据的处理操作
 *
 * java.io.InputStream
 * 所有字节流的父类,是一个抽象类.规定了所有字节输入流都必须具备的读取字节的方法.
 *
 * java.io.OutputStream
 * 所有字节流输出流的父类,是一个抽象类,规定了所有字节输出流都具备的写出字节的方法.
 *
 * FileOutputStream(File file) 
 *           创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *           若file 中已经 有数据,则将原有数据删除.将本次通过流写出的内容作为文件数据
 * FileOutputStream(File file, boolean append)
 *           创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
 *           如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
 *           
 * FileOutputStream(String name)           
 *           创建一个向具有指定名称的文件中写入数据的输出文件流。
 * FileOutputStream(String name, boolean append)           
 *           创建一个向具有指定 name 的文件中写入数据的输出文件流。*
 *
 * 文件流
 * 是一套低级流, 读写文件数据
 * 与 RandomAccessFile 的对比:
 * 1. 论功能是一致的,都用来读写文件数据
 * 2. RAF 对于文件,可读可写,但文件流不行.
 *      文件输入流只用来读取文件数据.
 *      文件输出流只用来向文件输出数据
 * 3. 流的特点是顺序读写操作.即,读写书不能会退的.
 *    RAF 是随机读写操作.因为依靠指针位置读写. 所以可以通过操作指针文件对文件任意位置读写.
 */

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt",true);

        String str = "夜空中最亮的星,是否听清1";
        fos.write(str.getBytes("UTF-8"));
        fos.close();





    }
}
