package thread;

import java.sql.SQLOutput;

/**
 * @PackageName: thread
 * @ClassName: ThreadDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/11 10:30
 **/

public class ThreadDemo1  {
    /**
     * 多线程允许我们同时执行多段代码
     *
     * 线城是并发运行的.线程调度统一规划CPU 时间
     * 将 CPU 时间划分为若干片段 尽可能的均匀分配给 所有要并发运行的线程
     * 每个线程在获得 CPU 时间片后 CPU 就来执行他的任务.当时间片用完后
     * CPU 会离开并执行获取到CPU 时间片的线程
     *
     * 所以.所有线程并非真正的同时运行着代码.
     * 宏观上感觉同时运行的现象称为并发运行
     *
     * 创建线程的方式:
     * 1. 继承 Thread 并重写 run 方法来定义线程任务
     *        不足:1. 由于java 是单继承,导致若继承了 Thread 就不能再继承其他类.
     *                在实际开发中非常不方便. 因为无法重用其他类的,某些方法
     *             2. 由于 继承 Thread 后重写 run 方法定义了线程要执行的任务,
     *                导致线程与线程要执行的任务有一个必然的耦合关系,不利于线程重用
     *
     */

    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        /**
         * 启动线程调用start() 方法
         * 会自动调用 run() 方法
         */
//        t1.start();
//        t2.start();
//        Thread t3 = new Thread(() -> {
//                System.out.println("hello");
//        });


    }
}


class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; ; i++) {
            System.out.println("T1");
        }

    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; ; i++) {
            System.out.println("T2");
        }

    }
}
