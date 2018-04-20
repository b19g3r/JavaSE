package homework.demo;

import java.util.Scanner;

/**
 * @Package:
 * @author: Shane Usage:
 * @date: 8年月日 下午4::49
 */

public class Testsssss {
	public static void main(String[] args) {

		String s = "able was i ere i saw elba";
		boolean flag = true;
		for (int i = 0; i < s.length() / 2; i++) {
		    if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
		        flag = false;
		        break;
		    }
		}
		System.out.println(flag);
//		StringBuilder s1 = new StringBuilder();
//		for (int i = s.length() - 1; i >= 0; i--)
//			s1.append(s.charAt(i));
//		s1.append("a");
//		System.out.println(s1);
//		// tese equals
//		for (int i = s.length() - 1; i >= 0; i--) {
//			if ((s.charAt(i) != s1.charAt(i))) {
//				System.out.println("false");
//				return;
//			}
//		}
//		System.out.println("yes");
	}

}
