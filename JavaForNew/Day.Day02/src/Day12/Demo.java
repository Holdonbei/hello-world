package Day12;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo {
    public static void main(String[] args) {
        show1();
        show2();
    }

    private static void show2() {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("王俊凯",21);
        map.put("易烊千玺",20);
        map.put("王源",20);
        System.out.println(map);
    }

    private static void show1() {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("王俊凯",21);
        map.put("易烊千玺",20);
        map.put("王源",20);
        System.out.println(map);//纯粹的map集合具有无序性
        //使用LinkedHashMap让建立的Map具有可预知的迭代顺序
    }
}
