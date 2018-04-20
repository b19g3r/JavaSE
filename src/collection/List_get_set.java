package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: collection
 * @ClassName: List_get_set
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 11:09
 **/

public class List_get_set {
    /**
     * java.util.List 线性表
     * List 特点: 可重复集, 有序, 通过下标操作元素
     * 常用实现类:
     *      ArrayList: 数组实现 查询块, 增删慢
     *      LinkedList: 链表实现,查询慢,增删块(首位增删效率最优)
     *      对于性能不是极端苛刻的情况下,通常使用 ArrayList
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zero");
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);

        System.out.println(list.get(2));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

//        list.set(2, "2");
        System.out.println(list.set(2,"2")+"\n"+list);

    }

}
