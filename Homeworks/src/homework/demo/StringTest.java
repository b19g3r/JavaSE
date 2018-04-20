package homework.demo;

import java.util.Scanner;

/**
 * @Package:
 * @author: Shane Usage:
 * @date: 2018年3月30日 上午9:45:00
 */

public class StringTest {

	public static void main(String[] args) {
		// String a = "aaa";
		// String b = "bbb";
		// String c = "aaa";
		// final String AA = "aaa";
		// final String AA2 = "aaa";
		//// System.out.println(a.length());
		//// System.class
		//
		// String a2 = "aa"+"a";
		// String aa1 = "aa";
		// String aa2 = aa1 + "a";
		//
		// System.out.println(a == aa2 ); // false
		// System.out.println(a == a2 ); // true
		// System.out.println(a+"\n"+b+"\n"+c); // a c 的 ID 是同一个,说明,两者是同一个对象的引用

		// String str = new String("ABC");
		//
		// String s = "你好啊,JAVA";
		// String s1 = "aa";
		//// System.out.println(s.length());
		// int[] a = {} ;
		//
		// char ch = s.charAt(0);
		//// System.out.println(ch);
		// for(int i=0;i<s.length();i++) {
		// char ch1 = s.charAt(i);
		//// System.out.print(ch1+".");
		// }
		//
		// String webaddr = "https://www.google.com/ncr";
		// // 查找 字符 / 在字符串中第一次出现的位置
		// int index = webaddr.indexOf('/');
		// System.out.println(index);
		//
		//
		// // 查找 字符 \ 在字符串中第一次出现的位置
		// int index1 = webaddr.indexOf('\\');
		// System.out.println(index1);
		//
		// // 查找 字符串 在字符串中第一次出现的位置
		// int index2 = webaddr.indexOf("//");
		// System.out.println(index2);
		// System.out.println(webaddr.charAt(index2));
		//
		// // 查找 字符串 在字符串中第一次出现的位置,从指定的索引开始
		// int index3 = webaddr.indexOf("//",7);
		// System.out.println(index3);
		// System.out.println();
		//
		// int index4 = webaddr.lastIndexOf('/');
		// System.out.println(index4);
		// System.out.println(webaddr.length());
		//
		//
		// 子串
		// String url = "http://tedu.cn/index.html";
		// String host= url.substring(7,14);
		// System.out.println(host);
		//
		// String s =url.substring(7, 7+7);
		// System.out.println(s);
		//
		//
		// String s1 = url.substring(7);
		// System.out.println(s1);

		// 动态获取主机名

		// String url = "http://tedu.com.cn/index.html";
		// int index = url.indexOf('/',7); // 返回在此字符串中第一次出现指定字符处的索引，从指定的索引开始搜索。
		// String host = url.substring(7,index); //
		// System.out.println(host);

		// int index1 = url.lastIndexOf('/');
		// String fileName = url.substring(index1+1,url.length());
		// System.out.println(fileName);

		// String trimString = " \n \t Hello \t \n ";
		// System.out.println(trimString.trim());
		// System.out.println(trimString);
		// System.out.println(trimString == trimString.trim());

		// String s1 = "a";
		// System.out.println(s1.trim());
		// System.out.println(s1 == s1.trim());
		// System.out.print('\n');
		// System.out.print('\r');
		// System.out.print('|');

		// System.out.println(url.startsWith("h"));
		// System.out.println(url.startsWith("H"));
		// System.out.println(url.startsWith("p",1));
		// System.out.println(url.charAt(-1));
		// Scanner sc = new Scanner(System.in);
		// final String EXIT1 = "exit";
		// String name = sc.next();
		// while ( name != "exit" ) {
		// if ( name.startsWith("J") ) {
		// System.out.println("Begain with J");
		// }
		// else {
		// System.out.println("NOT begain with J");
		// }
		// name = sc.next();
		// }
		// System.out.println("EXITED");
		//
		//

		//
		// StringBuilder s1 = new StringBuilder();
		// System.out.println(s1.length()); // 0
		// System.out.println(s1.capacity()); // 16
		// s1.append("范传奇");
		// System.out.println(s1.length()); // 3
		// System.out.println(s1.capacity()); // 16
		// s1.append("早晨出门以后");
		// System.out.println(s1.length()); // 9
		// System.out.println(s1.capacity()); // 16
		// s1.append("干了件惊天动地");
		// System.out.println(s1.length()); // 16
		// System.out.println(s1.capacity()); // 16
		// s1.append("的大事");
		// System.out.println(s1.length()); // 19
		// System.out.println(s1.capacity()); // 34
		//
		// s1.insert(0, "据传说");
		// System.out.println(s1);
		// System.out.println(s1.length()); // 19
		// System.out.println(s1.capacity()); // 34
		// s1.append("据传说")
		// .append("据传说")
		// .append("据传说")
		// .append("据传说")
		// .append("据传说")
		// .append("据传说")
		// .append("据传说");
		// System.out.println(s1);
		// System.out.println(s1.length()); // 43
		// System.out.println(s1.capacity()); // 70 ????? why not 68 ?

		String url1 = "https://www.google.com/ner";

		int start = url1.startsWith("https") ? 8 : 7;
		int ends = url1.indexOf("/", start);
		String host = url1.substring(start, ends);
		System.out.println(host);

	}
}
