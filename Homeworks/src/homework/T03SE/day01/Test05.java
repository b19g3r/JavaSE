package homework.T03SE.day01;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 随机生成一个5位的英文字母验证码(大小写混搭)
 * 然后将该验证码输出给用户，然后要求用户输入该验证码，大小写不限制。
 * 然后判定用户输入的验证码是否有效(无论用户输入大小写，只要字母都正确即可)。
 *
 */
public class Test05 {
    public static void main(String[] args) {
        // 生成 并 打印 验证码
        String cap = generateCAPTCHA();
        // 接收输入
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // check 并 output
        check(input, cap);
    }
    // 检查 并且 打印
    private static void check(String input, String cap) {
        System.out.println( input.equalsIgnoreCase(cap) ? "Correctly" : "Wrong");

    }

    // 生成 并 输出 验证码
    private static String generateCAPTCHA() {
        char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
                'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z' };
        char[] ch = new char[5];
        for (int i = 0; i < 5; i++) {
            ch[i] = letters[(int)(Math.random()*letters.length)];
        }
        String cap = new String(ch);
        System.out.println(cap);
        return cap;
    }


}
