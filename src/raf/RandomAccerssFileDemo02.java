/**   
 * @Package: raf @author: Shane  	@date: 2018年4月4日 下午2:35:44 
 * Usage: 
 */
package raf;


import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccerssFileDemo02 {

	/**
	 * RAF 读写基本数据及RAF基于指针的操作
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("type.dat", "rw");
		
		// 将一个 int 最大值写入文件
		int max = Integer.MAX_VALUE;
		/**
		 * 01111111 11111111 11111111 11111111 
		 * 右移:  max>>>24
		 * 00000000 00000000 00000000 01111111
		 * 
		 * max>>>16
		 * 00000000 00000000 01111111 11111111
		 * 
		 * 直接写出基本数据类型:
		 * writInt(int d)
		 * 一次性将给定的 int 值对应的4个字节全部写出
		 * 
		 * 读取: RAF 是基于指针进行读写数据的.即 RAF 总是在指针当前位置读写字节,并且读写完毕后,指针自动移动到下一个字节的位置
		 * 创建 RAF 后 指针默认在文件的第一个字节位置
		 * 
		 * void seek(long pos)
		 * 将文件指针设置到指定位置
		 * 
		 * 在读取 4 个字节 int 的过程中发现到了文件末尾,则抛出 EOFException 
		 */
		/*raf.write(max>>>24);
		System.out.println(raf.getFilePointer());		// 1
		raf.write(max>>>16);
		System.out.println(raf.getFilePointer());		// 2
		raf.write(max>>>8);
		System.out.println(raf.getFilePointer());		// 3
		raf.write(max);
		System.out.println(raf.getFilePointer());		// 4
		raf.writeInt(max);
		System.out.println(raf.getFilePointer());		// 8
		raf.writeDouble(123.123);
		System.out.println(raf.getFilePointer());		// 16
		raf.writeLong(123L);
		System.out.println(raf.getFilePointer());		// 24
		System.out.println("写出完毕");
//		raf.seek(0);
		System.out.println(raf.getFilePointer());		// 0
		int a = raf.readInt();
		System.out.println(raf.getFilePointer());		// 4
		System.out.println(a);
		int d = raf.readInt();
		System.out.println(raf.getFilePointer());		// 4
		System.out.println(d);
		raf.close();
		*/
		raf.writeInt(max);
		raf.writeInt(-1);
		long a = raf.readLong();
		System.out.println(Long.MAX_VALUE);
		System.out.println(a);
		
	}

}
