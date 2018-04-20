package thread;

/**
 * @PackageName: thread
 * @ClassName: Tickets
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/12 14:06
 **/

public class Tickets {

    public static void main(String[] args) {


        Piao p = new Piao();

        Thread t1 = new Thread(() -> {
            while (Piao.amount > 0) {
                System.out.print("T1: ");
                p.decrease();
            }
        });
        Thread t2 = new Thread(() -> {

                System.out.print("T2: ");
                p.decrease();

        });

        t1.start();
        t2.start();
    }

}

class Piao {
    protected static int amount = 20;

    public void decrease() {
        System.out.println("Tickets amount:" + amount);
        amount--;
    }
}