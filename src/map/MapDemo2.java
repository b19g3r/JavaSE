package map;

import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: map
 * @ClassName: MapDemo2
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/19 10:19
 * @Verson: v0.1
 **/

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("语文", 90);
        map.put("数学", 50);
        map.put("英语", 66);
        map.put("物理", 25);
        map.put("化学", 86);
        System.out.println(map);
        System.out.println(map.containsValue(86));
        System.out.println(map.containsKey("数学"));
        System.out.println(map.containsValue("数1学"));





    }
}
