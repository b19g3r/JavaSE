package thread;

/**
 * @PackageName: thread
 * @ClassName: PriorityDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/11 15:59
 **/

public class PriorityDemo {
    /**
     * 线程优先级
     * 线程调用 start 方法后纳入线程调度统一管理
     * 线程不能主动获取cpu时间片,智能被动分配
     * 调整线程优先级可以最大程度的改善某个线程获取CPU时间片的几率
     * 理论上线程优先级越高的线程获取CPU时间片的次数越多
     *
     * 线程优先级有 10 个等级,用整数 1 - 10 表示,数越大越高
     *
     * void setPriority(int p)
     * 可以设置线程优先级
     *
     * 提供三个常量分别表示最低,默认 最高
     */

    public static void main(String[] args) {
        Thread max = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("max");
            }
        });
        Thread min = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("min");
            }
        });
        Thread nor = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("nor");
            }
        });

        max.setPriority(Thread.MAX_PRIORITY);
        min.setPriority(Thread.MIN_PRIORITY);
        nor.setPriority(Thread.NORM_PRIORITY);

        max.start();
        min.start();
        nor.start();





    }
}
