/**   
 * @Package: string 
 * @author: Shane  	Usage: 使用正则表达式验证字符串
 * @date: 2018年4月2日 上午10:40:34 
 */
package string;

public class MatchesDemo {

	/**
	 * 将字符串拆分,保存到字符串数组中
	 */
	public static void main(String[] args) {
		// excemple@host.com
		// regex = [a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\.[a-zA-Z0-9_+]+
		String mailRegex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)+";
		String mailRegex1 = "\\w+@\\w+(\\.\\w+)+";
		String mail = "wang@qq.com";
		String mail1 = "wwwassa@edu.edsd.sda.com";
		System.out.println(mail1);
		boolean bl = mail.matches(mailRegex);
		boolean bl1 = mail1.matches(mailRegex1);
		System.out.println(bl);
		System.out.println(bl1);
		// www.example.some.com
		String urlRegex = "\\w+(\\.\\w+)+";
		
		
		
		
		
		
				
				
				
				
				
	}


}
