/**   
 * @Package: string 
 * @author: Shane  	Usage: 
 * @date: 2018年4月2日 上午11:51:29 
 */
package string;

public class ReplaceAllDemo {

	/**
	 * public String replaceAll(String regex, String replacement)
	 * 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
	 * 参数：
	 * 		regex - 用来匹配此字符串的正则表达式
	 * 		replacement - 用来替换每个匹配项的字符串 
	 * 返回：
	 * 		所得 String 
	 */
	public static void main(String[] args) {
		
		
		String regex = "\\d+";
		String replacement = "#NUMBER#";
		String str = "abc123def456ghi";
		String strRep = str.replaceAll(regex, replacement);
		System.out.println(strRep);
	}

}
