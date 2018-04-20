package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @PackageName: collection
 * @ClassName: CollectionDemo5
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/13 16:46
 **/

public class CollectionDemo5 {
    public static void main(String[] args) {
        Collection c1 = new ArrayList();
        c1.add("Java");
        c1.add("C#");
        c1.add("C++");
        System.out.println(c1);

        Collection c2 = new ArrayList();
        c2.add("Android");
        c2.add("ios");
        System.out.println(c2);
        c1.addAll(c2);
        System.out.println(c1);

        Collection c3 = new ArrayList();
        ((ArrayList) c3).add("C++");
        ((ArrayList) c3).add("PHP");
        ((ArrayList) c3).add("C++");
        // 在c1 中删除 和 c3 的公有元素
        c1.removeAll(c3);
        System.out.println(c3);
    }
}
