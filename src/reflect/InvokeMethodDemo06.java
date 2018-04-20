package reflect;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @PackageName: reflect
 * @ClassName: InvokeMethodDemo06
 * @Description: 利用反射API 动态执行对象的方法
 * @Author: Shane
 * @Date: 2018/4/20 16:39
 * @Verson: v0.1
 **/

public class InvokeMethodDemo06 {
    public static void main(String[] args) throws Exception {
        // 获取类名和方法名
        Scanner sc = new Scanner(System.in);
        String className = sc.next();
//        String fieldName = sc.next();
        String methodName = sc.next();
        String parm = sc.next();

        // 动态加载类
        Class classObject = Class.forName("reflect."+className);
//        Object parms = classObject.cast(parm);
        /**
         * 加载方法: 在类中找到需要执行的 methodName 方法
         * 若方法名错误,抛出异常:
         **/
//        Method method = methodname.;
        Method methodObj = classObject.getDeclaredMethod(methodName, String.class);
        Class[] cs = methodObj.getParameterTypes();

        for (Class c: cs) {
            System.out.println(c);
        }

        System.out.println(methodObj);
        /**
         * 执行方法: invock(obj)
         * obj 一定是包含 method 的对象
         */
        Object obj = classObject.newInstance();
        // 动态调用方法
        Object value = methodObj.invoke(obj,parm);
//        Object value1 = methodObj.invoke(obj);
        // 输出结果
        System.out.println(value);



    }


}

