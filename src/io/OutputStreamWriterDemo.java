/**   
 * @Package: io @author: Shane  	@date: 2018年4月9日 上午9:45:10 
 * Usage: OutputStreamWriter
 */
package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {

	/**
	 * Usage:字符流
	 * Java 将流按照读写单位划分为字节流与字符流.InputStream 和 OutputStream 是所有字节流的父类
	 * java.io.Reader 和 java.io.Writer 是字符流的父类
	 * 
	 * 字符流只是方便我们读写字符,底层本质还是读写字节,只是字节与字符流的转换工作交给了字符流来完成
	 * 
	 * 转换流:
	 * java.io.InoutStreamReader
	 * java.io.OutputStreamReader
	 * 
	 * Java 提供了其他高级字符流 都有的一个特点就是只能连接在其他字符流上,
	 * 但是通常低级字符流都是字节流这就导致字符流不能直接搭配字节流使用 但是
	 * 转换流例外,他们本身是字符流,而又可以连接字节流,所以在实际开发中当我
	 * 们使用高级的字符流时通常与字节流连接时要使用 转换流 它起到将字符转换字节 的功能
	 * 承上启下
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream fos  = new FileOutputStream("osw.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		// 不用借用 byte 数组
		osw.write("简单点,说话"
				+ "的方式简单点");
		System.out.println("写出完毕");
		osw.close();

	}

}
