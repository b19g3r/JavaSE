/**   
 * @Package: raf @author: Shane  	@date: 2018年4月4日 上午11:31:28 
 * Usage: 
 */
package raf;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
//import java.io.UnsupportedEncodingException;

public class WriteStringDemo {

	/**
	 * 向文件中写入字符串
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw");
		
		String str = "你在南方aaa\n";
		/**
		 * String 类 提供了将字符串转换成字节的方法
		 * byte[] getBytes()
		 * 按照系统默认字符集转换(不推荐,存在平台差异)
		 * 
		 * byte[] getBytes(String charsetName)
		 * 按照要求的字符集转化,字符集名称不区分大小写.
		 * 常见字符集:
		 * GBK, UTF-8, 
		 * 
		 */
		byte[] data = str.getBytes("UTF-8");
		raf.write(data);
		raf.close();
		
		System.out.println();
		
	}

}
