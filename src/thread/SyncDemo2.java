package thread;

/**
 * @PackageName: thread
 * @ClassName: SyncDemo2
 * @Description: 同步快
 * @Author: Shane
 * @Date: 2018/4/12 15:37
 **/

public class SyncDemo2 {
    /**
     * sunchronized (同步监视器) {
     * 需要同步运行的代码片段
     * }
     * 可以更灵活准确的锁定需要同步运行的代码片段
     * 这样可以有效缩小同步范围提高并发效率
     * 但是要注意,必须保证多个线程看到的同步监视器对象是"同一个"才可以
     */
    public static void main(String[] args) {
        Shop s = new Shop();
        Thread t1 = new Thread() {
            @Override
            public void run() {
                s.buy();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                s.buy();
            }
        };

        t1.start();
        t2.start();

    }

}

class Shop {
    public void buy() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + " 正在挑衣服 ");
            Thread.sleep(5000);
            synchronized (this) {
                System.out.println(t.getName() + " 正在试衣服 ");
                Thread.sleep(5000);
            }
            System.out.println(t.getName() + " 结账离开 ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}