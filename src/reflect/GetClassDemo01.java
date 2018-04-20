package reflect;


import java.lang.reflect.Constructor;
import java.util.*;

/**
 * @PackageName: reflect
 * @ClassName: Demo1
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/20 9:30
 * @Verson: v0.1
 **/

public class GetClassDemo01 {
    public static void main(String[] args) {
        Person person1 = new Person("小王", 18);
        Person person2 = new Person("小刘", 21);
//        System.out.println(person1.getClass());
//        System.out.println(person2.getClass());

        test(person1);
        test(person2);
        test(1);
        test(0.2);
        test(1L);
        test("a");
        test('a');

        // 检查迭代器接口的具体实现类型
        List list = new LinkedList();
        Iterator ite = list.iterator();
        Class cls = ite.getClass();
        System.out.println(cls);

        Set set = new HashSet();
        ite = set.iterator();
        // ite 变量引用的具体对象类型?
        cls = ite.getClass();
        System.out.println(cls);

    }

    public static void test(Object o) {
        // 动态获取 obj 类型
        Class cls = o.getClass();
        System.out.println(cls);

//        // 检查对象类型中声明了哪些属性
//        // 动态获取 cls 代表的类型中声明的属性
//        Field[] fields = cls.getDeclaredFields();
//        for (Field f : fields) {
//            System.out.println(f);
//        }
//
//        // Method
//        // 来自 reflect 包.代表 cls中声明的方法信息
//        Method[] methods = cls.getDeclaredMethods();
//        for (Method m : methods) {
//            System.out.println(m);
//        }

        /**
         * 获取类中声明的全部构造信息
         * Constructer
         */
        Constructor[] constructors = cls.getConstructors();
        for (Constructor cons : constructors) {
            System.out.println(cons);
        }


    }

//}


    static final class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}