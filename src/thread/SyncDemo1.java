package thread;

/**
 * @PackageName: thread
 * @ClassName: SyncDemo
 * @Description: 多线程并发安全问题
 * @Author: Shane
 * @Date: 2018/4/12 14:23
 **/

public class SyncDemo1 {
    /**
     * 当多个线程并发运行同一操作数时,由于线程切换的时机不可控,
     * 可能会导致操作该数据时的过程未按照程序设计的顺序执行,
     * 导致出现混乱,严重是导致系统瘫痪
     */

    public static void main(String[] args) {
        Table t = new Table();
        Thread t1 = new Thread() {
            public void run() {
                while (true) {
                    Thread.yield();
                    System.out.println(getName() + " : "+t.getBean());
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                while (true) {
                    Thread.yield();
                    System.out.println(getName() + " : "+t.getBean());
                }
            }
        };

        t1.start();
        t2.start();
        }
    }

    class Table {
        private int beans = 20;
/**
 *@Description: 当一个方法被 synchronized 修饰后,变为同步方法.多个线程不能同时进入该方法
 *              而是必须有顺序的一个一个运行.可以避免并发安全问题
 *
 *              在方法上使用 synchronzed ,那么 同步监视器就是该方法所属对象.即 方法中看到的 this
 *
 *@Return: int
 *@Author: Shane
 *@Date: 2018/4/12 15:20
 **/
        public synchronized int getBean() {
            if (beans == 0) {
                throw new RuntimeException("豆子没了");
            }
            // 模拟线程qiehua - x
            Thread.yield();
            return beans--;
        }
    }