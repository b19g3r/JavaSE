package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: map
 * @ClassName: MapDemo1
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/19 9:27
 * @Verson: v0.1
 **/

public class MapDemo1 {
    /**
     * java.util.Map
     * Map 查找表
     * Map描述的是一个多行两列的表格,左列成为key,右列成为value
     * 存储数据总是以key-value成对存储，而查询(获取)值是根据
     * key获取对应的value。
     * 所以使用上经常是将需要作为查询条件的值作为key，将查询的
     * 内容作为value保存在Map中。
     *
     * Map是一个接口，定义了Map的功能方法。常用的实现类为:
     * java.util.HashMap，称为散列表，哈希表
     * HashMap是基于散列算法实现的Map，当今查询最快的数据结构
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("语文", 90);
        map.put("数学", 50);
        map.put("英语", 66);
        map.put("物理", 25);
        map.put("语文", 50);
/**
 * 不要使用基本类型接收返回值,因为会触发自动装箱的特性:
 * int n = map.put("语文", 10);
 * 会被改为L
 * int n = map.put("语文",10).intValue();
 *  put() 返回值:
 *      返回以前与 key 关联的值，如果没有针对 key 的映射关系，则返回 null。
 *      （如果该实现支持 null 值，则返回 null 也可能表示此映射以前将 null 与 key 关联）。
 *      若拆箱会引发空指针异常
 *
 */
        int p = map.put("语文", 100);
        int n = map.get("语文");

        System.out.println(map);

        // 查看数学成绩
        // get() 返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null
        n = map.get("数学");
        System.out.println(n);
        System.out.println(map.size());
        // remove() 溢出键值对. 返回: 前与 key 关联的值；如果没有 key 的映射关系，则返回 null。
        n = map.remove("语文");
        System.out.println(n);
        Integer key = map.remove("lishi");
        System.out.println(key);

    }
}
