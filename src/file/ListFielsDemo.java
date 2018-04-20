/**   
 * @Package: file @author: Shane  	@date: 2018年4月3日 上午11:38:13 
 * Usage: 
 * 		 获取,目录中的所有子项
 */
package file;

import java.io.File;

public class ListFielsDemo {

	/**
	 * String[] list() : 返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
	 * File[] listFiles() : 返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。
	 * boolean	isDirectory() : 测试此抽象路径名表示的文件是否是一个目录。
	 * boolean	isFile() : 测试此抽象路径名表示的文件是否是一个标准文件。
	 */
	public static void main(String[] args) {
		
		
		File file = new File("./");
		System.out.println(file.getName());
		File[] fiels = file.listFiles();
		
//		String[] s = file.list();
//		for(String ss : s)
//			System.out.print(ss+"\t");
//		System.out.print("\n"+s.length+"\n");
		
		for(File f : fiels) {
			System.out.print(f.getName()+"\t");
		}
		System.out.println();
		for(File f : fiels) {
			if ( f.isFile() ){
				System.out.print("文件 :"+f.getName()+"\t");
			}
			if ( f.isDirectory() ){
				System.out.print("目录 :"+f.getName()+"\t");
			}
		}
	}

}
