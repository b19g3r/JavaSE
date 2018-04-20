package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @PackageName: collection
 * @ClassName: CollectionDemo7
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 9:31
 **/

public class CollectionDemo7 {
    /**
     * JDK 1.5 之后的新特性.泛型
     * 也成参数化类型.指定一个类中的属性类型,方法参数的类型,返回值的类型等.
     * 好处是: 将类型的定义权交给调用者,不是提供者决定.,提高其灵活性
     * 在集合中广泛使用,用于指定集合中的元素类型
     * 若不指定类型,默认为原型 Object
     */
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        /**
         * 当调用方法传入泛型约束的参数时,编译器会检查
         * 实际参数是否符合改参数指定的泛型类型,不符合,编译不通过
         * 由于当前集合泛型指定为 String ,那么调用 add() 时,编译器会
         * 检查实际参事是否为 String 不符合就编译失败
         */
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");
        strings.add("five");
        System.out.println(strings);
        for (String element : strings) {
            System.out.println(element);
        }

        Iterator<String> it = strings.iterator();
        // 编译后class 文件的样子：
        // Iterator it = strings.iterator();


        while (it.hasNext()) {
            /**
             * 当获取一个泛型类型的值时,编译器会自动根据泛型指定的实际类型做向下造型工作。
             */
            System.out.println(it.next());
            // 编译后class 文件的样子：
            // System.out.println((String)it.next());
        }
    }

}
