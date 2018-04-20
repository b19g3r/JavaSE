package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @PackageName: collection
 * @ClassName: CollectionDemo8
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 10:05
 **/

public class CollectionDemo8 {
    /**
     * 泛型是编译器认可,而非虚拟机
     * 泛型不指定,默认是 Object
     * 泛型是编译器辅助做了一些事情:
     * 1.设置泛型类型值时,编译器辅助检查数据类型是否匹配
     * 2.获取泛型类型值时,编译器会添加向下造型语句
     */
    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>();
        ((ArrayList<Integer>) integers).add(1);
        ((ArrayList<Integer>) integers).add(2);
        ((ArrayList<Integer>) integers).add(3);
        ((ArrayList<Integer>) integers).add(4);
        System.out.println(integers);
        System.out.println();
        for (Integer element : integers) {
            System.out.println(element);
        }
        Collection integers2 = integers;
        integers2.add("one");
        System.out.println(integers);

        for (Integer elements : integers) {
            System.out.println(elements);  // ClassCastException
        }
    }
}
