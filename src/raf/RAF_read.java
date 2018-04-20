/**   
 * @Package: raf @author: Shane  	@date: 2018年4月3日 下午5:17:35 
 * Usage: 
 */
package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RAF_read {

	/**
	 * 从文件中读取字节
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("data.dat", "r");
		int d = raf.read();
		System.out.println(d); 
		d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
		d = raf.read();
		System.out.println(d);
	}

}
