package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @PackageName: collection
 * @ClassName: CollectionDemo4
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/13 15:37
 **/

public class CollectionDemo4 {
    public static void main(String[] args) {
        /**
         * 集合存放的是元素的引用
         */
        Point p = new Point(2,3);
        Collection c = new ArrayList();
        ((ArrayList) c).add(p);
        System.out.println(c);
        p.setX(56);
        System.out.println(p);
        System.out.println(c);
    }
}
