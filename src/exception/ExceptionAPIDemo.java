package exception;

/**
 * @PackageName: exception
 * @ClassName: ExceptionAPIDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/10 10:43
 **/

public class ExceptionAPIDemo {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            String str = "a";
            System.out.println(Integer.parseInt(str));
        } catch (Exception e) {
            System.out.println("出错了");
//            e.printStackTrace();
//            e.getCause();
            System.out.println(e.getMessage());

        }
        System.out.println("程序结束");
    }
}
