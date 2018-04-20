/**   
 * @Package: raf @author: Shane  	@date: 2018年4月3日 下午5:39:45 
 * Usage: 
 */
package raf;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src = new RandomAccessFile("1.mp3", "r");
		RandomAccessFile src_copy = new RandomAccessFile("2.mp3", "rw");
		int d = -1;		// 保存没此读取到的字节
		
		while ((d = src.read()) != -1) {
			src_copy.write(d);
		}
		src.close();
		src_copy.close();

		System.out.println("Done");
	}
}
