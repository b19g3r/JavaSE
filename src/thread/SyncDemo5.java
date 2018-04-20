package thread;

/**
 * @PackageName: thread
 * @ClassName: SyncDemo5
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/12 17:28
 **/

public class SyncDemo5 {
    /**
     * 死锁现象
     * 线程都保持自己的锁,但是都等待对方先释放锁时,
     * 相互僵持,导致程序不在继续向下运行
     * 出现死锁
     */
    public static void main(String[] args) {
        Coo c = new Coo();
        Thread t1 = new Thread(() -> {
            c.methodA();
        });

        Thread t2 = new Thread(() -> {
            c.methodB();
        });

        t1.start();
        t2.start();
    }
}
class Coo {
    private Object syncA = new Object();
    private Object syncB = new Object();
    public void methodA() {

        synchronized (syncA) {
            Thread T = Thread.currentThread();
            System.out.println(T.getName()+" mA 正在运行...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void methodB() {

        synchronized (syncB) {
            Thread T = Thread.currentThread();
            System.out.println(T.getName()+" mB 正在运行...");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}