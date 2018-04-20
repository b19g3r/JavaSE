/**   
 * @Package: raf @author: Shane  	@date: 2018年4月4日 下午5:23:14 
 * Usage: 
 */
package homework.demo;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Test02UserInfoReadDemo {

	/**
	 * 读取注册信息
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");

		for (int i = 0; i < raf.length() / 100; i++) {
			byte[] data = new byte[32]; // 创建 byte 数组 32 个字节
			int len = raf.read(data); // len <=> 32
			String name = new String(data, "utf-8").trim();	// trim() 去除两端空格
			data = new byte[32];
			len = raf.read(data);
			String passwd = new String(data, "utf-8").trim();
			data = new byte[32];
			len = raf.read(data);
			String nickname = new String(data, "utf-8").trim();
			int age = raf.readInt();
			System.out.println(name + " " + passwd + " " + nickname + " " + age);
		}
	}

}
