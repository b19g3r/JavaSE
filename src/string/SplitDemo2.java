/**   
 * @Package: string 
 * @author: Shane  	Usage: 图片重命名
 * @date: 2018年4月2日 上午11:40:19 
 */
package string;

import java.util.Arrays;

public class SplitDemo2 {
	public static void main(String[] args) {
		String name = "abc.jpg";
		String reg = "\\.";
		String[] spl = name.split(reg);
		System.out.println(Arrays.toString(spl));
		name = System.currentTimeMillis()+"."+spl[1];
		System.out.println(name);
		
	}
}
