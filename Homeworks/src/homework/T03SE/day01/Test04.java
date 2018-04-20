package homework.T03SE.day01;

import java.util.Scanner;

/**
 * 要求用户从控制台输入一个email地址，然后获取该email的用户名(@之前的内容)
 */
public class Test04 {
    public static void main(String[] args) {
        // 接收输入
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        // check
        if (check(s)) {
            System.out.println(getUsername(s));
        } else {
            System.out.println("Illegal input! Check.");
        }
        // Print
        //System.out.println(getUsername(s));

    }
    // 获取 username
    private static String getUsername(String s) {
        return s.substring(0,s.indexOf('@'));
    }
    // 判断字符串是否是合法邮箱地址(简单判断)
    private static boolean check(String s) {
        // name @ some.ex.com
        // \w+@(\w+)(\.\w+)+
        // 字符  @ 字符 (.字符)+
        String regex = "\\w+@(\\w+)(\\.\\w+)+";
        return (s.matches(regex));
    }
}
