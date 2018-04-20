/**   
 * @Package: file @author: Shane  	@date: 2018年4月3日 上午10:47:33 
 * Usage: 
 * 		:
 */
package file;

import java.io.File;

public class DeletefileDemo {

	/**
	 * Usage:
	 */
	public static void main(String[] args) {
		File file = new File("./test.txt");
		if ( file.exists()) {
			file.delete();
			System.out.println("Deleting...");
		} else {
			System.out.println("Not Exists");
		}

	}

}
