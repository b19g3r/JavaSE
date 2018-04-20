package exception;

/**
 * @PackageName: exception
 * @ClassName: ThrowDemo
 * @Description: throw 关键字 抛出异常
 * @Author: Shane
 * @Date: 2018/4/10 9:17
 **/

public class ThrowDemo {
    /**
     * 有异常的抛出
     *
     * throw 关键字 抛出异常.
     * 两种情况主动抛出异常:
     * 1.程序满足语法要求,但是不满足业务逻辑要求,可以主动抛出异常给调用者
     * 2.程序出现异常,但是不应该在当前代码片段中解决该异常时可以抛出给调用者
     */
    public static void main(String[] args) {
        Person p = new Person();

        /**
         * 当我们调用一个含有 throws 声明的方法时,
         * IDE 要求我们必须处理这个异常.处理方式有两种:
         * 1. try-catch 捕获并处理
         * 2. 在当前方法上继续使用throws 声明抛出异常
         *
         */

        try {
            p.setAge(1000);
        } catch (IllegalAgeException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(p.getAge());

    }
}
