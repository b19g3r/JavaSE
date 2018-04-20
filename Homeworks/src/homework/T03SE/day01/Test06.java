package homework.T03SE.day01;

//import java.util.Arrays;
import jdk.dynalink.Operation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 要求用户输入一个计算表达式，可以使用加减乘除。
 * 只处理一次运算的，不要有连续加减乘除的表达式,且不做小数计算。(例:1+2+3)
 * 例如:
 * 1+2
 * 然后经过处理计算结果并输出:1+2=3
 */
public class Test06 {
    public static void main(String[] args) {
        // 计算两个非负整数的四则运算
        /*
        Scanner sc = new Scanner(System.in);
        String left = sc.next();
        String op = sc.next();
        String right = sc.next();
        int leftNumber = Integer.parseInt(left);
        int rightNumber = Integer.parseInt(right);
        int res = 0;
        if("+".equals(op)){
            res = leftNumber + rightNumber;
        } else if ("-".equals(op)) {
            res = leftNumber - rightNumber;
        } else if ("*".equals(op)) {
            res = leftNumber * rightNumber;
        } else if ("/".equals(op) && rightNumber != 0 ) {
            res = leftNumber / rightNumber;
        } else {
            System.out.println("Wrong operater or Dividend can't be 0");
            return;
        }
        System.out.println(res);
        */

        Scanner sc = new Scanner(System.in);
        String operation = sc.nextLine();
        String[] num = operation.split("[+\\-*/]");
        String op = operation.substring(1,2);
//        System.out.println(op);
//        System.out.println(Arrays.toString(num));
        int leftNumber = Integer.parseInt(num[0]);
        int rightNumber = Integer.parseInt(num[1]);
        int res = 0;
        if("+".equals(op)){
            res = leftNumber + rightNumber;
        } else if ("+".equals(op)) {
            res = leftNumber - rightNumber;
        } else if ("*".equals(op)) {
            res = leftNumber * rightNumber;
        } else if ("/".equals(op) && rightNumber != 0 ) {
            res = leftNumber / rightNumber;
        } else {
            System.out.println("Wrong operater or Dividend can't be 0");
            return;
        }
        System.out.println(res);

    }
}








