package exception;

/**
 * @PackageName: exception
 * @ClassName: TryCatchDemo
 * @Description: 异常捕获
 * @Author: Shane
 * @Date: 2018/4/9 16:33
 **/

public class TryCatchDemo {
    /**
     * Java异常捕获中的 try-catch
     * <p>
     * 语法:
     * try {
     * 代码片段
     * } caatch (XXException e) {
     * 捕获try代码片段中的 XXException 异常并处理
     * }
     */

    public static void main(String[] args) {
        System.out.println("程序开始");
        // todo co,,commnts
        try {
            String str = "a";
            System.out.println(str.length());
            // try 块中 出错代码之后的代码不会继续执行
            System.out.println(str.charAt(0));
            System.out.println(Integer.parseInt(str));
            System.out.println();
            System.out.println("异常之后的程序");
        } catch (NullPointerException e) {
            // 若try 中没有异常, catch 块不执行
            System.out.println("空指针异常");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
        } catch (Exception e) {
            // 应当养成习惯,在最后一个catch 捕获 Exception .
            // 防止因未捕获的异常导致程序中断
            System.out.println("WRONG");
        }
        System.out.println("程序结束");
    }
}
