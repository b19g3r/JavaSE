/**   
 * @Package: raf @author: Shane  	@date: 2018年4月4日 下午4:48:54 
 * Usage: 
 */
package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Test01UserInfoWriteDemo {

	/**
	 * Usage:完成用户注册功能
	 * 
	 * user.dat 文件保存用户信息. 包括 username, password, nickname, age (除年龄是 int 外其余都是字符串
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		// 先将文件指针移动到末尾,以便追加记录
		raf.seek(raf.length());
		
		String name = "王老师";
		String password = "123456";
		String nickname = "网";
		int age = 45;
		
		// 写入文件
		/**
		 * 每条记录100个字节,32*3 + 4 
		 * 数据留白便于以后修改
		 */
		// 写入 name 字段
		byte[] data = name.getBytes("UTF-8");		// 将 name 字符串转成 byte 数组
		data = Arrays.copyOf(data, 32); 			// 数组扩容
		raf.write(data);							// 向文件写入数据 (32字节)
		
		// 写入 passwd 字段
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32); 
		raf.write(data);
		
		// 写入nickname 字段
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32); 
		raf.write(data);
		
		// 写入 age 字段 (int 类型,4个字节)
		raf.writeInt(age);
			
	}

}
