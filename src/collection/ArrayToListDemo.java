package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @PackageName: collection
 * @ClassName: ArrayToListDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 15:16
 **/

public class ArrayToListDemo {
    public static void main(String[] args) {
        String[] strings = {"one", "two", "three", "four"};
        List<String> list = Arrays.asList(strings);
        System.out.println(list);
        // 对集合元素操作就是对数组元素操作
        list.set(0,"1");        // 合法的.在原的位置上进行操作
        System.out.println(list);
        /**
         * list.set(0,"1");   合法的.在原的位置上进行操作
         * 由于添加元素都会导致数组扩容,就不能表示原数组.所以,以下两个操作会引起异常:
         *     list.add("five");  UnsupportedOperationException,相当于产生了新的数组
         *     list.remove(2);    UnsupportedOperationException
         * 若想对集合增删元素,需复制一个集合
         *
         */
        List<String> ls = new ArrayList<>(list);
        ls.add("100");
        System.out.println(ls);
//        System.out.println(Arrays.toString(strings));
    }
}
