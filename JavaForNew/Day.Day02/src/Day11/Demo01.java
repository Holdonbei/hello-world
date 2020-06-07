package Day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        //show1();
        show2();
    }

    private static void show2() {
        Map<String,Integer> map = new HashMap<>();
        map.put("易烊千玺",20);
        map.put("王俊凯",21);
        map.put("王源",20);
        System.out.println(map);
        System.out.println("===================");
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for(Map.Entry<String,Integer> entry : set){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }

    private static void show1() {
        Map<String,Integer> map = new HashMap<>();
        map.put("易烊千玺",20);
        map.put("王俊凯",21);
        map.put("王源",20);
        System.out.println(map);
        Set<Map.Entry<String,Integer>> set = map.entrySet();//Entry属于Map里面的一个接口，因此Entry首字母需要大写。
        Iterator<Map.Entry<String,Integer>> it = set.iterator();//使用迭代器遍历set集合
        while(it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        //除去迭代器外，可以使用增强for循环遍历set集合
        for (Map.Entry<String, Integer>  entry : set){
        String key = entry.getKey();
        Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
