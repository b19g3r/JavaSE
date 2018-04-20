package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @PackageName: collection
 * @ClassName: Collection_sort3
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 17:00
 **/

public class Collection_sort3 {
    /**
     *
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("苍老师");
        list.add("传奇");
        list.add("小泽老师");
        /**
         * 除了具有侵入性之外,Collection.sort() 还有一个问题,
         * 若比较元素已经实现了Comparable 接口并定义了比较规则,
         * 但是该规则不满足我们的实际需要并且又无法重写,例如String类
         *
         * 推荐的排序方式:
         *     当遇到排序自定义类型元素,或集合元素自身的比较规则不满足排序时,
         *     建议使用下面的排序方式.
         * 该sort() 方法要求额外传入一个比较器,并按照比较器规则比较集合元素
         * 并进行排序.不需要集合元素实现Comparable 接口
         */
        System.out.println(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(list);

    }
}
