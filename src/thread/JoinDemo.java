package thread;

/**
 * @PackageName: thread
 * @ClassName: JoinDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/12 9:05
 **/

public class JoinDemo {
    /**
     * void join()
     * 允许一个线程在另一个线程上等待,直到其执行完毕后再继续运行
     * 可以协调线程间的同步运行
     *
     * 同步运行: 代码执行有先后顺序(单线程同步运行,多线程也可以进行同步操作
     * 异步运行: 各自执行(多线程下运行代码是异步的)
     */

    // 设置图片是否下载完毕
    public static boolean isFinish;

    public static void main(String[] args) {
        final Thread download = new Thread(() -> {
            System.out.println("Start Downloading ... ");
            for (int i = 0; i < 100; i++) {
                System.out.println("Down: "+i+"%");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Download Finsished");
            isFinish = true;
        });

        final Thread show = new Thread(() -> {
            System.out.println("Starting Show.");
            try {
                download.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!isFinish) {
                throw new RuntimeException("Image Load Error");
            }
            for (int i = 0; i < 100; i++) {
                System.out.println("Showing: "+i+"%");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Show Finsh");
        });

        download.start();
        show.start();

    }
}
