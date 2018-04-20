package reflect;

import java.lang.reflect.Field;
import java.util.Scanner;

/**
 * @PackageName: reflect
 * @ClassName: FieldGeDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/20 14:43
 * @Verson: v0.1
 **/

public class FieldGetDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Scanner in = new Scanner(System.in);
        System.out.println("类名"); // Koo
        System.out.println("属性名"); // name
        String className = in.next();
        String fieldName = in.next();
        // 动态加载类
        Class cls = Class.forName("reflect." + className);
        // 查找类中的属性
        Field field = cls.getDeclaredField(fieldName);
        System.out.println(field);
        // 动态创建对象obj 一定要包含指定属性值
        Object obj = cls.newInstance();
        /**
         * 在obj 对象上获取field 属性的值
         * 若 没有 field 属性的值,则抛出异常
         *
         * 属性名是用户运行期间输入的.具体值为用户在程序运行期间指定的.
         * 这意味着, 程序与属性之间的松耦合的关系
         */
        Object name = field.get(obj);
        System.out.println(name);
    }
}
