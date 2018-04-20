package thread;

/**
 * @PackageName: thread
 * @ClassName: SyncDemo4
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/12 17:02
 **/


public class SyncDemo4 {
    /**
     * 互斥锁
     * 使用 synchronized 锁定多段代码,而锁对象相同时,这些代码片段之间就是互斥的.
     * 多个线程不能同时执行这些代码
     */
    public static void main(String[] args) {
        Boo b1 = new Boo();
        Thread t1 = new Thread(() -> {
            b1.methodA();
        });
        //Boo b2 = new Boo();
        Thread t2 = new Thread(() -> {
            b1.methodB();
        });

        t1.start();
        t2.start();
    }


}

class Boo {
    public synchronized void methodA() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " :mA正在运行");
            Thread.sleep(5000);
            System.out.println(t.getName() + " :mA运行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void methodB() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " :mB正在运行");
            Thread.sleep(5000);
            System.out.println(t.getName() + " :运mB行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}