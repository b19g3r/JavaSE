/**   
 * @Package: file @author: Shane  	@date: 2018年4月3日 下午3:14:18 
 * Usage: 
 * 		:
 */
package file;

import java.io.File;
import java.io.FileFilter;

public class ListFielsFileFilterDemo {

	/**
	 * Usage:获取当前目录中的所有文本数据
	 */
	public static void main(String[] args) {
		File dir = new File(".");
		
		//FileFilter filter = 
		
		File[] fi = dir.listFiles(new FileFilter() {		// 匿名内部类
			@Override
			public boolean accept(File file) {
				System.out.println("Filteing :"+file.getName());
				return file.getName().startsWith(".");
			}
		});
		for ( File f : fi) {
			System.out.println("Output : "+f.getName());
		}
		
	}
	


}

/**
 * 实现了文件过滤接口后,要求必须重写accept 方法.该方法的作用是定义过滤规则.当参数 file 满足要求该方法时返回 true 
 */

//class MyFilter implements FileFilter {
//
//	@Override
//	public boolean accept(File file) {
//		System.out.println("Filteing :"+file.getName());
//		return file.getName().endsWith(".txt");
//	}
//
//}