/**   
 * @Package: io @author: Shane  	@date: 2018年4月9日 上午11:33:38 
 * Usage: 
 */
package io;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/*
 * 在流连接中使用 pw
 */
public class PrintWruterDemo2 {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(
								new FileOutputStream("pw2.txt")
								,"UTF-8"
						)
				)
		);
		
		pw.println("我爱北京天安门,");
		pw.println("天安门上太阳升,");
		System.out.println("Done");
		pw.close();
	}
}
