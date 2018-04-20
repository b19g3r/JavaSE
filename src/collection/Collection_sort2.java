package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @PackageName: collection
 * @ClassName: Collection_sort2
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 15:58
 **/

public class Collection_sort2 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>();
        list.add(new Point(5, 6));
        list.add(new Point(1, 3));
        list.add(new Point(2, 8));
        list.add(new Point(3, 4));
        list.add(new Point(9, 8));
        list.add(new Point(4, 7));
        System.out.println(list);
        /**
         * Collections.sort() 要求列表实现 Compareable 接口
         * 此方法具有侵入性.
         *      侵入性是指:当我们使用某个功能时,该功能要求我们为其修改代码.
         *      修改的越多,侵入性越强,一旦不需要该功能,这些改动将不具有意义.
         *      在实际的开发中不推荐
         */
        Collections.sort(list);
        System.out.println(list);
    }
}
