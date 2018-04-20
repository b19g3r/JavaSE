package collection;

import java.util.*;

/**
 * @PackageName: collection
 * @ClassName: Collection_sort
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 15:44
 **/

public class Collection_sort {
    /**
     * 排序集合
     * java.util.Collections.sort(List<T> list ) : 对集合进行自然排序(从小到大)
     * 条件: 被排序的是list,并且是可比较的
     * <p>
     * Collection   是接口
     * Collections  是集合工具类
     */

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            l1.add(random.nextInt(10));
        }
        System.out.println(l1);
        Collections.sort(l1);
        System.out.println(l1);
    }
}
