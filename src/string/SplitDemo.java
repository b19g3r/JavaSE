/**   
 * @Package: string 
 * @author: Shane  	Usage: Split
 * @date: 2018年4月2日 上午11:07:18 
 */
package string;

import java.util.Arrays;

public class SplitDemo {

	/**
	 * public String[] split(String regex)
	 * 根据匹配给定的正则表达式来拆分此字符串。
	 * 此方法返回的数组包含此字符串的子字符串，
	 * 每个子字符串都由另一个匹配给定表达式的子字符串终止，
	 * 或者由此字符串末尾终止。数组中的子字符串按它们在此字符串中出现的顺序排列。
	 * 如果表达式不匹配输入的任何部分，那么所得数组只具有一个元素，即此字符串。
	 */
	public static void main(String[] args) {

		String str = "www.hosts.mail.qq.com";
		String strSplitRegex = "\\d+";
		String strSplitRegex1 = "\\d";
		String urlRegex = "\\.";
		String[] da = str.split(strSplitRegex);
		String[] da1 = str.split(strSplitRegex1);
		String[] da2 = str.split(urlRegex);
		System.out.println(da.length+" "+Arrays.toString(da));
		System.out.println(da1.length+" "+Arrays.toString(da1));
		System.out.println(da1.length+" "+Arrays.toString(da2));
		
	}

}
