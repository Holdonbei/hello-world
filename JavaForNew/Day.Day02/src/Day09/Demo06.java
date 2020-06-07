package Day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo06 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//Collection集合下面包含了ArrayList集合，这里的ArrayList子集合里面重写了toString方法
        coll.add("何东蓓");
        coll.add("周莉婷");
        System.out.println(coll);
        boolean b  = coll.remove("何东蓓");
        boolean a  = coll.remove("ak47");
        System.out.println(coll);
        boolean c = coll.contains("周莉婷");
        boolean d = coll.contains("何东蓓");
        System.out.println(c);
        System.out.println(d);
        boolean z = coll.isEmpty();
        System.out.println(z);
        coll.add("何东蓓");
        coll.add("詹姆斯");
        coll.add("周冬雨");
        coll.add("易烊千玺");
        coll.add("王俊凯");
        System.out.println(coll);
        for (String s :coll){
            System.out.println(s);
        }
    }
}
