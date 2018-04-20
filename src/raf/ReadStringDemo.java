/**   
 * @Package: raf @author: Shane  	@date: 2018年4月4日 下午2:07:06 
 * Usage: 
 */
package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadStringDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		
		byte[] data = new byte[1000];
		int len = raf.read(data);
		/**
		 * String 类 提供了构造方法:
		 * String(byte[] data)
		 * 按照默认的字符集将字节数组内容转化为字符串
		 * 
		 * String(byte[] data, String charset)
		 * 按照指定的的字符集将字节数组内容转化为字符串
		 * 
		 * String(byte[] data, int off, int len , String charset)
		 * 按照指定的的字符集将字节数组从偏移off开始的len个连续的内容转化为字符串
		 */
//		String str = new String(data,0,len);
		String str = new String(data,0,len);
		System.out.println(str);
		
		
		
		
		
	}
}
