/**   
 * @Package: homework @author: Shane  	@date: 2018年4月4日 下午6:53:09 
 * Usage: 
 */
package homework.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.sql.SQLOutput;
import java.util.Scanner;

import javafx.scene.transform.Scale;

public class Test03UserInfoSearchPractice {
	/**
	 * 查询用户功能
	 * 
	 * 程序启动后,要求输入要查询的用户名
	 * 然后将该用户信息输出,格式:user,pwd,nick,age
	 * 
	 * 若输入的用户在user.dat文件中不存在,则提示:
	 * 查无此人
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
		// 输入要查询的 name
		System.out.println("Please input a name to search");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.next();
		// 判断输入是否为空
        if (searchName.length() < 0 ) {
            System.out.println("用户名不能为空");
            return;
        }
        // 若不为空,执行查找
		// 单条数据的大小为100字节
		final int UNIT = 100;		
		boolean notFound = true;
		System.out.println("Searching...");
		
		for(int i=0; i<raf.length()/UNIT; i++) {
			// 临时存放字段数据
			byte[] data = new byte[32];		
			// 读取 name 字段
			raf.read(data);
//			String name = new String(data).trim();
            String name = new String(data,"UTF-8").trim();
			// 若名字相符
			if (searchName.equals(name)) {		
				// 继续读取此人密码数据
				notFound = false;
				raf.read(data);
				String passwd = new String(data,"UTF-8").trim();
				raf.read(data);
				String nickname = new String(data,"UTF-8").trim();
				int age = raf.readInt();
				// 输出数据
				System.out.println(i+1+" "+name+" "+passwd+" "+nickname+" "+age);
				// 是否退出循环?如果不需要继续查找,就break.
				break;
			} else {
				// 文件指针移动到下一个人
                raf.seek(i*100);        // 可将else部分去掉,将此句移动到for 循环的开始位置.
//				raf.seek(raf.getFilePointer()+68);
				continue;
			}
		}
		// 如果 notFound 
		if(notFound) {
			System.out.println("Not Found!");
		}
			
	}

}
