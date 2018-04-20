package thread;

/**
 * @PackageName: socket
 * @ClassName: DemonThreadDemo
 * @Description: 守护线程
 * @Author: Shane
 * @Date: 2018/4/11 17:20
 **/

public class DemonThreadDemo {
    /**
     * 又称后台线程.默认创建的都不是守护线程.
     * 守护线程需要调用线程提供的方法
     * void setDemon(boolean on)设置
     * 当参数为 true 时,线程变为守护进程
     *
     * 与普通线程没区别,但是结束时机有区别,
     * 当进程结束时,所有运行的守护线程都会强制结束
     *
     * 进程结束: 当一个进程中所有普通线程都结束时,进程结束
     *
     *
     */
    public static void main(String[] args) {
        Thread rose = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Rose: Let me go.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("rose: aaaaaaaaaaaaaaaaaa");
            System.out.println("Duang");
        });

        Thread jack = new Thread(() -> {
            while(true) {
                System.out.println("Jack: U jump i jump");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        rose.start();
        // 守护进程的 setDaemon(bnoolean b) 要在start() 之前调用
        jack.setDaemon(true);
        jack.start();



    }
}
