package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @PackageName: collection
 * @ClassName: CollectionDemo6
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/13 17:03
 **/

public class CollectionDemo6 {
    /**
     * 遍历集合元素
     * Collection 提供了统一的遍历集合元素的方式:
     * 迭代器模式
     * <p>
     * Iterator iterator()
     * 该方法可以获取一个用于遍历当前集合元素的迭代器实现类
     * 不同的集合实现类都提供了
     * <p>
     * 遍历过程: 问 取 删(删除是非必需操作)
     */
    public static void main(String[] args) {
        Collection c = new ArrayList();
        ((ArrayList) c).add("1");
        c.add("#");
        ((ArrayList) c).add("2");
        c.add("#");
        ((ArrayList) c).add("3");
        c.add("#");
        ((ArrayList) c).add("4");
        c.add("#");
        ((ArrayList) c).add("5");

        System.out.println(c);

        Iterator it = c.iterator();
        //int index = 0;
        while (it.hasNext()) {
            String i = (String) it.next();
            if ("#".equals(i)) {
                it.remove();
            }
            System.out.println("i = " + i);
        }

        System.out.println(c);


    }


}

