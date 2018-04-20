package collection;

import java.sql.SQLOutput;
import java.util.*;

/**
 * @PackageName: collection
 * @ClassName: SyncAPIDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 17:42
 **/

public class SyncAPIDemo {
    /**
     * 线程安全的集合
     *
     * 常用的实现类: ArrayList,linkedList,HashSet
     * 都不是线程安全的,多线程情况下使用会出现并发安全问题
     * Collections 提供了将集合转换成线程安全的方法
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        System.out.println(list);
        // 将集合转换为线程安全的
        list = Collections.synchronizedList(list);
        System.out.println(list);
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
        set = Collections.synchronizedSet(set);
        System.out.println(set);

        /**
         * API 手册中有说明,就算是一个线程安全的集合,也不和迭代器遍历做互斥
         * 所以若并发操作是存在有遍历操作时要自行维护他们之间的互斥关系
         *
         */

    }
}
