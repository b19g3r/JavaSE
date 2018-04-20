package exception;

/**
 * @PackageName: exception
 * @ClassName: FinallyDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/9 17:23
 **/

public class FinallyDemo {
    /**
     * finally 块
     * finally 块只能定义在异常处理机制的最后,可以直接跟在 try 后面或者最后一个 catch 之后
     * <p>
     * finally 块可以保证只要程序运行在 try 中,无论 try 的代码片段是否出现异常,
     * finally 里的代码都必然执行.
     * 通常把释放资源等操作放在 finally 中.比如流的关闭
     */
    public static void main(String[] args) {
        System.out.println("Begain");
        try {
            System.out.println("try");

            return;
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            // finally 中的语句 会在 return 之前调用
            System.out.println("finally");
        }
        System.out.println("Outside of try-catch");
    }
}
