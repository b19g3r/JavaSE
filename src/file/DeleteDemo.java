/**   
 * @Package: file @author: Shane  	@date: 2018年4月3日 上午11:13:02 
 * Usage:删除目录  delete 只能删除空目录
 */
package file;

import java.io.File;

public class DeleteDemo {
	public static void main(String[] args) {
		File file = new File("./1");
		if ( file.exists()) {
			System.out.println("Deleting..."+file.delete());
		}
		else {
			System.out.println("Do Not Exists.");
		}
	}
}
