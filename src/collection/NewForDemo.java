package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @PackageName: collection
 * @ClassName: NewForDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/13 17:36
 **/

public class NewForDemo {
    /**
     * for each 循环
     * 新循环是编译器认可.会在编译源代码时自动改为传统 for 循环遍历
     */
    public static void main(String[] args) {
        Collection<String> S = new ArrayList<>();
        S.add("1");
        S.add("#");
        S.add("2");
        S.add("#");
        S.add("3");
        S.add("#");
        S.add("4");
        S.add("#");
        S.add("5");
        S.add("#");

        for (Object o : S) {
            System.out.println((String)o);

        }
    }
}
