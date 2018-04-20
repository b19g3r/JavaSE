/**   
 * @Package: homework @author: Shane  	@date: 2018年4月4日 下午6:55:45 
 * Usage: 
 */
package homework.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

public class Test04UserPasswdChangePractice {

	/**
	 * 修改密码功能
	 *
	 * 程序启动后,要求用户输入用户名及密码,然后将
	 * user.dat文件中该用户的密码更改.
	 * 若没有该用户,则提示:用户名无效
	 * @throws IOException
	 *
	 */
	public static void main(String[] args) throws IOException {
		final int UNIT = 100;
		boolean notFound = true;

		// 创建文件对象
		RandomAccessFile raf = new RandomAccessFile("user.dat","rw");
		// 接收用户输入
		System.out.println("Please input name and password you want to search");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.next();
		String searchPasswd = sc.next();

		// 查找
		for(int i=0; i<raf.length()/UNIT; i++) {
			// 读取第 i 个 name 字段
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data).trim();
			// 比较,若相同

            if (searchName.equals(name)) {

                notFound = false;
                // 读取 passwd 字段
                raf.read(data);
                String passwd = new String(data).trim();
                // 判断密码是否相符
                if (searchPasswd.equals(passwd)) {
                    // 若相符,接收输入新密码
                    System.out.println("Please input a new password:");
                    String newPasswd = sc.next();
                    // 写入新密码
                    data = newPasswd.getBytes("UTF-8");
                    data = Arrays.copyOf(data, 32);

                    raf.seek(raf.getFilePointer()-32);
                    raf.write(data);


                    System.out.println("Password has been changed!");
                } else {
                    // 若密码不符合,结束循环
                    System.out.println("Wrong password!");
                    break;
                }
            }

        }

		if (notFound) {
			System.out.println("not Found!");
		}


	}


}
