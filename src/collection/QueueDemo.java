package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @PackageName: collection
 * @ClassName: QueueDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/17 9:29
 **/

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");

//        System.out.println(queue);
//        queue.poll();
        System.out.println(queue);
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

//        while (queue.size() > 0) {
//
//            System.out.println(queue.poll());
//        }
//        System.out.println(queue);
    }
}
