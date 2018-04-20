package homework.T03SE.day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 */
public class Test02 {
    public static void main(String[] args) {

        String s = "大家好!";
        System.out.println(s);
        // 建立一个StringBuilder 类, 实现字符串的append
        StringBuilder s1 = new StringBuilder(s);
        s1.append("我是程序员!");
        System.out.println(s1);

        // 此时,原字符串仍未改变,调用String类的构造方法,使符合题意
//        s = new String(s1);
        System.out.println(s);


        s1.insert(6,"优秀的");
        System.out.println(s1);

        s1.replace(6,6+2,"牛牛");
        System.out.println(s1);

        s = s1.substring(4);
        System.out.println(s);






    }

    /**
     * Created by Shane on 2018/4/5 21:43
     */
    public static class Test03 {
    }
}

