/**   
 * @Package: file @author: Shane  	@date: 2018年4月3日 上午10:34:19 
 * Usage: 
 * 		:
 */
package file;

import java.io.File;
import java.io.IOException;

public class CeratNewFileDemo2 {

	/**
	 * 在当前目录中创建一个文件
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
		File file = new File("./test.txt");
		if ( file.exists() ) {
			System.out.println("Already Exists ");
			File newFile = new File("./test"+"1"+".txt");
			newFile.createNewFile();
		} else {
			file.createNewFile();
			System.out.println("Now Created");
		}	
			
	}

}
