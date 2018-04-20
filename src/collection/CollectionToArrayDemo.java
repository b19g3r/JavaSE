package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: collection
 * @ClassName: CollectionToArrayDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 14:46
 **/

public class CollectionToArrayDemo {
    /**
     * 将集合转化为数组
     * Collection 提供了一个方法: toArray.可将当前集合转化为一个数组
     */
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("qwer");
        l1.add("qwer");
        l1.add("qwer");
        l1.add("qwer");
        l1.add("qwer");
        l1.add("qwer");
        l1.add("qwer");
        l1.add("qwer");
        String[] a = l1.toArray(new String[1]);
//        a = l1.toArray(a);
        for (String string:a) {
            System.out.println(string);
        }
//        System.out.println(a);
    }
}
