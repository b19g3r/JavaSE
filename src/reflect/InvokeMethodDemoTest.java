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

public class InvokeMethodDemoTest {
    public static void main(String[] args) throws Exception {
        // 获取类名/方法名/参数
        Scanner sc = new Scanner(System.in);
        String className = sc.next();
        String methodName = sc.next();
        String parm = sc.next();

        // 动态加载类
        Class classObject = Class.forName("reflect."+className);

        /**
         * 加载方法: 在类中找到需要执行的 methodName 方法
         * 若方法名错误,抛出异常:
         **/
        Method methodObj = classObject.getDeclaredMethod(methodName, String.class);
        Class[] cs = methodObj.getParameterTypes();
        for (Class c : cs) {
            System.out.println(c);
        }




    }


}

