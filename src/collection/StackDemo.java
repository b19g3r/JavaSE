package collection;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @PackageName: collection
 * @ClassName: StackDemo
 * @Description: 使用双端队列实现栈: FILO
 * @Author: Shane
 * @Date: 2018/4/17 10:39
 **/

public class StackDemo {
    public static void main(String[] args) {
        Deque<String> stack = new LinkedList<>();

        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");
        stack.push("five");
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
