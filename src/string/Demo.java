/**   
 * @Package: string 
 * @author: Shane  	Usage:  Object 类 
 * @date: 2018年4月2日 下午2:04:57 
 */
package string;

public class Demo {

	/**
	 * Usage:
	 */
	public static void main(String[] args) {
		String s = "someapp/manager/emplist.action";
		int index = s.lastIndexOf('/');
		//String subS = s.substring(index+1);
		String subS = s.substring(index+1,s.length());
		System.out.println(s+"\n"+subS);
	}

}


