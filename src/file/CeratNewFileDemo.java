/**   
 * @Package: file @author: Shane  	@date: 2018年4月3日 上午10:34:19 
 * Usage: 
 * 		:
 */
package file;

import java.io.File;
import java.io.IOException;

public class CeratNewFileDemo {

	/**
	 * 在当前目录中创建一个文件
	 * @throws IOException 
	 */

	public static void main(String[] args) throws IOException  {

		File file = new File("./test.txt");
		if ( file.exists() ) {
			System.out.println("Already Exists ");
		} else {
			file.createNewFile();
			System.out.println("Now Created");
			System.out.println();

		}	
			
	}

}
