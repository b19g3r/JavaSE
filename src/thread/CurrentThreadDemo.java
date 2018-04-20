package thread;

/**
 * @PackageName: socket
 * @ClassName: CurrentThreadDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/11 15:19
 **/

public class CurrentThreadDemo {
    /**
     * 线程提供了一个静态方法:
     * static Thread currentThread()
     * 可以获取运行这个方法的线程
     * <p>
     * java 中所有的代码都是线程运行的.main() 也不例外
     * JVM 启动后会启动一个线程来执行main()
     * 通常称这个线程为主线程
     * <p>
     * 在Spring 的AOP 中有一个功能,对数据库事物的切面处理.
     * 本质上用到了ThreadLocal 这个类
     * 里面就要使用 Thread.currentTHread() 得知运行代码的线程
     */

    public static void main(String[] args) {

        System.out.println("main " + Thread.currentThread());
        dosome();

        Thread t = new Thread() {
            @Override
            public void run() {
                Thread t = Thread.currentThread();
                System.out.println("t " + Thread.currentThread());
                dosome();
            }
        };
        t.start();
    }

    public static void dosome() {

        System.out.println("do " + Thread.currentThread());
    }
}
