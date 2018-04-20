package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: collection
 * @ClassName: List_subList
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 14:07
 **/

public class List_subList {
    /**
     * 截取指定范围内的子集
     */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        System.out.println(l);
        List<Integer> l1 = l.subList(3, 8);

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i, l1.get(i)*10);
        }
        System.out.println(l1);
        // 对子集的操作就是对原集合的操作
        System.out.println(l);
        l.subList(2,9).clear();
        System.out.println(l);
        System.out.println(l1.size());
    }
}
