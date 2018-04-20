package thread;

/**
 * @PackageName: thread
 * @ClassName: ThreadDemo3
 * @Description: 匿名内部类创建线程
 * @Author: Shane
 * @Date: 2018/4/11 11:42
 **/

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("匿名内部类 lambda 表达式");
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        });


        Thread t2 = new Thread() {
            @Override
            public void run() {
                System.out.println("normal匿名内部类");
            }
        };


        Thread t3 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("匿名内部类实现接口");
                    }
                });


        t1.start();
        t2.start();
        t3.start();

    }
}
