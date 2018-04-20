package thread;

/**
 * @PackageName: thread
 * @ClassName: SleepBlockDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/11 16:41
 **/

public class SleepBlockDemo {
    /**
     * 睡眠阻塞
     * <p>
     * static void sleep(long ms)
     * 当一个线程执行sleep方法后就会进入阻塞状态指定的毫秒.
     * 超时后线程会自动回到RUNNABLE 状态等待再次并发运行
     * 该方法会要求必须处理 InterruptedException 即
     * 当一个线程处于睡眠阻塞是被其他线程调用interrupted 方法
     * 中断时会抛出该中断异常并打断睡眠阻塞
     * <p>
     * iunterrupt() 方法时线程的一个方法.用于中断线程
     * 但是若线程处于阻塞状态时时中断阻塞
     * 若线程没有处于阻塞状态则线程直接被中断
     */

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("go sleeop");
            try {
                Thread.sleep(100000000);
            } catch (InterruptedException e) {
                System.out.println("t1 been Interruped ,now Running");
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                for (int i = 0; i < 6; i++) {
                    System.out.println("t2 Runing, t1.state: " + t1.getState());
                    Thread.sleep(1000);
                }
                System.out.println("duang !!!");
                /**
                 * JDK 1.8 之前,由于jvm 内存分配问题,
                 * 要求一个方法中的局部局部内部类若引用这个方法的其他局部变量时,
                 * 要求该变量必须是 final 的. 所以 main() de 局部内部类 t2 引
                 * 用了main() 的局部变量 t1时, t1 必须是 final 的
                 */
                t1.interrupt();
                System.out.println("T2 done");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        // 多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
//        t2.start();


    }
}
