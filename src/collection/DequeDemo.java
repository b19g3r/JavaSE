package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @PackageName: collection
 * @ClassName: DequeDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/17 10:11
 **/

public class DequeDemo {
    /**
     * 双端队列
     * java.util.Deque extends java.util.Queue
     * <p>
     * 两端操作
     */
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.offer("one");
        deque.offer("two");
        deque.offerFirst("zero");
        deque.offerLast("four");
        deque.offerLast("three");

        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());


    }
}
