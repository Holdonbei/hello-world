package Day11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02 {
    public static void main(String[] args) {
        show1();
    }

    private static void show1() {
        Map<Person,String> map = new HashMap<>();
        map.put(new Person("易烊千玺",20),"中国");
        map.put(new Person("王俊凯",21),"中国");
        map.put(new Person("王源",20),"中国");
        System.out.println(map);
        //在使用增强for循环之前应该通过Map.Entry将map里面的键值对传送到Map.Entry里面
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for (Map.Entry<Person,String> entry : set )
        {
            Person  key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
