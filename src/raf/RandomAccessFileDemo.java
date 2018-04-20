/**   
 * @Package: raf @author: Shane  	@date: 2018年4月3日 下午3:56:17 
 * Usage: java.io.RandomAccessFile
 * 		专门读文件数据的,基于指针操作
 * 
 */
package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	/**
	 * 创建 RandomAccessFile 的常用构造方法:
	 * RandomAccessFile(String path,String mode)
	 * RandomAccessFile(File file,String mode)
	 * 第一个参数 指定文件,第二个指定权限, "r" for read-only  "rw" for Read and Write
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException  {
		RandomAccessFile raf = new RandomAccessFile("./data.dat", "rw");
		/**
		 * public void write(int b) :
		 * 		向此文件写入指定的字节。从当前文件指针开始写入。
		 * 		只写低8位 
		 */
//		raf.write(1);
		raf.write(-1);		// 只写进了 8 个 1  输出 为 255 (256-1) 
		raf.write(256);		// 只写进了 8 个 0 
		System.out.println("写完了");
		
		raf.close();
		
		
		
	}
}
