package thread;

/**
 * @PackageName: thread
 * @ClassName: ThreadDemo2
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/11 11:30
 **/

public class ThreadDemo2 {
    /**
     * 创建新线程的第二种方式
     */
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();

    }
}

class MyRunnable1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Who r u");
        }
    }
}
class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("ME");
        }
    }
}
