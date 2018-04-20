package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @PackageName: reflect
 * @ClassName: ClassForNameDemo02
 * @Description: 动态加载类到内存中
 * @Author: Shane
 * @Date: 2018/4/20 10:42
 * @Verson: v0.1
 **/

public class ClassForNameDemo02 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入类名");
        String className = sc.nextLine();
        // 动态加载类 当类名错误时,会抛出类没有找到的异常. 只加载一次
        Class cls = Class.forName(className);
        System.out.println(cls);
        // 可以继续检查cls的内部结构
        Method[] methods = cls.getDeclaredMethods();
//        for (Method m: methods) {
//            System.out.print(m+" ");
//        }
        /**
         * 动态创建对象
         * 要求类有无参构造器
         */
        Object obj = cls.newInstance();
        System.out.println(obj);
        Object obj2 = cls.newInstance();
        System.out.println(obj2);


    }
}
