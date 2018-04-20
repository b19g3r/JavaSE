package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * @PackageName: collection
 * @ClassName: CollectionDemo
 * @Description: java.util.Collection
 * @Author: Shane
 * @Date: 2018/4/13 14:08
 **/

public class CollectionDemo {
    /**
     * java.util.Collection
     * java.util.List : 可重复,有序
     * java.util.Set : 不可重复,大部分实现类无序
     * 元素是否重复依靠元素自身equals() 比较的结果而定
     */

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(1,2));
        c.add(new Point(4,3));


        System.out.println(c + " " + c.isEmpty());
        c.clear();
        System.out.println(c + " " + c.isEmpty());
        /**
         * boolean	contains(Object o)
         * 如果此 collection 包含指定的元素，则返回 true。
         **/

        System.out.println(c.contains("3"));
        System.out.println(c.contains(3));
    }
}
