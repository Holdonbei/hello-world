package Day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) {
        show1();
    }

    private static void show1() {
        Map<String, Integer>  map  = new HashMap<>();
        map.put("易烊千玺",20);
        map.put("王俊凯",21);
        map.put("何东蓓",20);
        System.out.println(map);
        Set<String> set = map.keySet();
        System.out.println(set);
        for (String s :set){
            int a = map.get(s);
            System.out.println(a);
        }
    }
}
