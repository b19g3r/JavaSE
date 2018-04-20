package thread;

/**
 * @PackageName: thread
 * @ClassName: InfoDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/11 15:47
 **/

public class InfoDemo {
    public static void main(String[] args) {
        Thread main = Thread.currentThread();
        System.out.println("ID " + main.getId()
                + " name " + main.getName() + " state " + main.getState()
                + " isAlive " + main.isAlive() + " isDaemon " + main.isDaemon()
                + " priority " + main.getPriority() + "  " + main.getStackTrace());
    }
}
