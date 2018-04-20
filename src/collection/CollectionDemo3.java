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

public class CollectionDemo3 {
    /**
     * java.util.Collection
     * java.util.List : 可重复,有序
     * java.util.Set : 不可重复,大部分实现类无序
     * 元素是否重复依靠元素自身equals() 比较的结果而定
     */

    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(new Point(01, 2));
        c.add(new Point(2, 1));
        c.add(new Point(4, 3));
        c.add(new Point(4, 43));
        c.add(new Point(43, 34));
        c.add(new Point(42, 33));
        System.out.println(c);
        // boolead remove(Object o)
        // 删除指定元素.删除为指定元素与集和元素 equal() 结果为 true 的 元素
        c.remove(new Point(2, 1));
        System.out.println(c);


    }
}



