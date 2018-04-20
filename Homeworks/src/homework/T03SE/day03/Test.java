package homework.T03SE.day03;

/**
 * 1.String s = new String(“xyz”);创建了几个String Object ？ >>>> 2
 * 2.String与StringBuilder的区别？
 * >>>> String 不可改变. StringBuilder 是可变的. append() 连接两个字符串.  在原来的字符串基础上.
 *
 * 3.String类能不能被继承，为什么？  >>>> 不能. final
 * 4.int 和Integer的区别 >>>> int 是基本类型. Integer 是其包装类
 * 5.“==”和“equals”的区别 >>>>
 * 6.String 是值传递还是引用传递？ >>>> 值传递
 * 7.数组有没有length()这个方法？String有没有length()这个方法？ >>>> 数组是属性. 类String 类是方法.
 */
public class Test {
    public static void main(String[] args) {
        String s = new String("xyz");
        /*创建了几个对象?
        * 等价于:
        * String original = "xyz";
        * String s = new String(original);
        * 所以是两个对象.
        */

        System.out.println(s);
    }
}
