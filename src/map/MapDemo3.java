package map;

import java.util.*;

/**
 * hashMap 遍历的三种方式
 * 1. 遍历所有key
 * 2. 遍历所有key-value 对
 * 3. 遍历所有value
 */
public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
//        Map<String, Integer> map = new HashMap<>();
        map.put("语文", 90);
        map.put("数学", 50);
        map.put("英语", 66);
        map.put("物理", 25);
        map.put("化学", 86);

        /**
         * 1. 遍历 key
         * Set<K> keySet()
         * 返回: 此映射中包含的键的 set 视图
         */
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        /**
         * 遍历每一组键值对
         * 在map接口中定义了一个内部接口: java.util.Map.Entry
         * Entry 的每一个实例用于表示当前Map中的一组键值对,其提供了两个常用方法:
         * K getKey() : 获取 k 值
         * V getValue() : 获取 value 值
         * Map的实现类都实现了Entry,并用实现类的每个实例表示一个具体的键值对.
         *
         * Set<Entry> entrySet()
         * 返回Map中所有键值对的集合
         */

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> e : entrySet) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }

        /**
         * 遍历所有 value
         * Collection<V> values()
         * 返回: 此映射中包含的值的 collection 视图
         */

        Collection<Integer> values = map.values();
        for (Integer i : values ) {
            System.out.print(i+" ");
        }

    }
}
