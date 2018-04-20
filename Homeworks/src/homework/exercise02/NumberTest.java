package homework.exercise02;

import java.util.Scanner;

/**
 * @PackageName: homework.exercise02
 * @ClassName: NumberTest
 * @Description: 用户从控制台接收一个字符串，通过程序判断该字符串是整数，还是小数。
 *               如果既不是整数也不是小数，程序输出“数字格式不正确”
 * @Author: Shane
 * @Date: 2018/4/819:34
 **/

public class NumberTest {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().trim();
        if(str.matches("^\\d+$")){
            System.out.println("Int: "+Integer.parseInt(str));
        } else if (str.matches("^\\d+\\.\\d+$")) {
            System.out.println("Double: "+Double.parseDouble(str));
        } else {
            System.out.println("Wrong number format");
        }


    }

}

