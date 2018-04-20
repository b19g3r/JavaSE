package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @PackageName: collection
 * @ClassName: List_add_remove
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 11:31
 **/

public class List_add_remove {
    /**
     *
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        System.out.println(list);

        list.add(1,"zero");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
