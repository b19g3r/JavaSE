/**   
 * @Package: file @author: Shane  	@date: 2018年4月3日 上午9:38:07 
 * Usage: 
 * File 的,每个实例是用于表示硬盘上的一个文件或目录
 * 可以:
 * 1. 访问其表示文件或目录的属性信息
 * 2. 操作文件或目录 (创建/删除)
 * 3. 访问一个,目录中的所有子项
 * 但是 不能 访问文件数据
 */
package file;

import java.io.File;

public class FileDemo {


	public static void main(String[] args) {
//		考虑到兼容性,文件目录一般用相对路径表示.运行环境决定着相对路径
		
		File file = new File("./demo.txt");		// . 表示当前的项目目录
		System.out.println(file.getName());
		long length = file.length();
		System.out.println(length+"Bytes");
		
		System.out.println("可读:"+file.canRead()+" 可写:"+file.canWrite()+" 是否隐藏:"+file.isHidden());
	}

}
