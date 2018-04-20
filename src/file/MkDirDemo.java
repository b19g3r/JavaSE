/**   
 * @Package: file @author: Shane  	@date: 2018年4月3日 上午10:55:27 
 * Usage: 
 * 		:
 */
package file;

import java.io.File;

public class MkDirDemo {

	/**
	 * 创建目录
	 */
	public static void main(String[] args) {
		File file = new File("./test");
		if (file.exists()) {
			System.out.println("Already Exists");
		} else {
			System.out.println("Making directory..."+file.mkdir());
		}
	}

}
