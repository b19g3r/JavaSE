package reflect;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @PackageName: reflect
 * @ClassName: ClassForNameDemo03
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/20 11:43
 * @Verson: v0.1
 **/

public class ClassForNameDemo03 {
    public static void main(String[] args) throws ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        String className = "reflect." + sc.nextLine();

        /**
         * 动态加载类.多次调用也只加载一次
         * faorName 返回值是同一个对象的引用
         * 不影响性能
         */
        Class cls1 = Class.forName(className);
        Class cls2 = Class.forName(className);
        Class cls3 = Class.forName(className);
        Class cls4 = Class.forName(className);
        System.out.println(cls1 == cls2 && cls2 == cls3 && cls3 == cls4);
    }
}
