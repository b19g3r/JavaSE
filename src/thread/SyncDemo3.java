package thread;

/**
 * @PackageName: thread
 * @ClassName: SyncDemo3
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/12 16:34
 **/


/**
 * 静态方法被  使用 synchronized 修饰后 该方法一定具有同步效果
 * 静态方法的锁的对象是当前类的类对象
 * Class 类
 * Class 类的每一个实例用于表示JVM 加载的一个类
 * 当 JVM 加载一个类的时候就会实例化一个Class稍微实例
 * 用于表示它.每个类在JVM内部都只有一个CLass 的实例.
 * 所以静态方法锁的就是当前类对应的Class的实例
 *
 */
public class SyncDemo3 {
    public static void main(String[] args) {
        Foo f = new Foo();
        Thread t1 = new Thread(() -> {

            f.doSome();
        });

        Foo f1 = new Foo();
        Thread t2 = new Thread(() -> {

            f1.doSome();
        });

        t1.start();
        t2.start();

    }
}

class Foo {
    public synchronized static void doSome() {
        Thread t = Thread.currentThread();
        try {
            System.out.println(t.getName()+" :正在运行");
            Thread.sleep(5000);
            System.out.println(t.getName()+" :运行结束");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
