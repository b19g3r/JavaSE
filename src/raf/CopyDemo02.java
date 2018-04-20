/**   
 * @Package: raf @author: Shane  	@date: 2018年4月4日 上午9:21:52 
 * Usage: 
 */
package raf;

//import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 由于硬盘的物理特性,导致随机读写效率很低,块读写的效率还是很不错的.
 * 随机读写 : 单字节读写数据
 * 块读写 : 没此一组字节读取数据
 * 所以,若想提高读写效率我们需要提高每次读写的数据量,以减少实际读写次数来达到
 */
public class CopyDemo02 {

		public static void main(String[] args) throws IOException {
			RandomAccessFile src = new RandomAccessFile("1.mp3", "r");
			RandomAccessFile desc = new RandomAccessFile("2.mp3", "rw");
			
			/**
			 * RAF 提供了一次 读取一组字节的方法:
			 * int read(byte[] data)
			 * 一次性读取指定字节数组总长度的字节量,并将这些字节村到该数组中,返回值为本次实际读取到的字节量,若返回值为 -1, 则表示本次读取的是文件末尾.
			 * 
			 * void write(byte[] data)
			 * 一次性将给定的字节数组 所有字节写入文件
			 * 
			 * void write(byte[] data, int off, int len)
			 * 从给定数组的偏移 off 处开始连续的 len 个字节一次性写出
			 */
			int len = -1;		// 每次实际读取到的字节数
			byte[] data = new byte[1024*10];
			long start = System.currentTimeMillis();
			if ((len = src.read(data)) != -1) {
				desc.write(data, 0, len);
			}
			long end = System.currentTimeMillis();
			
			System.out.println("Copy ended. "+(end - start)+"ms");

			System.out.println();
		}

}
