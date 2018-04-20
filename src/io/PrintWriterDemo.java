/**   
 * @Package: io @author: Shane  	@date: 2018年4月9日 上午10:55:51 
 * Usage: 
 */
package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 缓冲字节流
 * java.io.BUfferedWriter
 * java.io.BUfferedReader
 * 
 * java.io.PrintWriter
 * 带有自动行刷新的缓冲字符输出流(常用)
 */

public class PrintWriterDemo {
		
	/**
	 * @throws IOException 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) throws IOException {
//		FileOutputStream fis = new  FileOutputStream("pw.txt");
		PrintWriter pw = new PrintWriter("pw.txt", "UTF-8");
		pw.println("123");
		pw.print("你好呐");
		pw.print("你好呐");
		System.out.println("done");
		pw.close();
				
	}
	
	
}
