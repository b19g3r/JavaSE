package map;

import java.util.Objects;

/**
 * @PackageName: collection
 * @ClassName: key
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/19 14:04
 * @Verson: v0.1
 **/

public class Key {
    /**
     * HashMap是当今查询速度最快的数据结构，内部由数组实现保存元素。
     * Hash 内部由数组保存数值对,存储元素时根据key的hashCode 值计算数组下标,并将键值对存入.获取时也根据
     * 该值计算下标直接找到该元素. 还是Map
     *
     * 由于 key的hashcode决定着key是否重复,所以这个方法要妥善重写
     * 当遇到两个key的hashcode一样,但是equals比较不为 true 的情况,会出现链表
     * 链表会降低查询性能.应尽量避免
     *
     * hashcode 与 equals 方法是定义在Object 类中.
     * java的类都重写了这两个方法
     * 自定义类需要重写equlas或hashcode 时必须遵循以下原则:
     * 1. 成对重写. equals() 和 hashcode()
     * 2. 一致性. 当两个对象equals() 为 true 时.hashcode应该相等.
     *    并且尽量保证 hashcode() 方法返回值相等时.equlas 方法比较为 true.否则会在hashcode 出现链表.
     * 3. 稳定性. 当参与equals() 比较的属性没有发生变化的情况下,多次调用 hashcode() 返回的数字不应有变化.
     *
     */
    private int x;
    private int y;


}
