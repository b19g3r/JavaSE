/**   
 * @Package: io @author: Shane  	@date: 2018年4月9日 上午10:22:03 
 * Usage: 
 */
package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("osw.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		
		int d = -1;
		while ((d=isr.read())!=-1) {
			char c = (char) d;
			System.out.print(c);
		}
	}

}
