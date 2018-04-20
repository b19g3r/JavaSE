/**   
 * @Package: file @author: Shane  	@date: 2018年4月3日 上午11:03:54 
 * Usage: 
 * 		:
 */
package file;

import java.io.File;

public class MkDirsDemo {

	/**
	 * Usage:创建多级目录
	 */
	public static void main(String[] args) {
		File file = new File("./1/2/3/4/5/6/7");
		if ( file.exists() ) {
			System.out.println("Already Exists");
		} else {
			System.out.println("Mking Directorys..."+file.mkdirs());
		}
		

	}

}
