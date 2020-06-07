package Day10;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03 {
    public static void main(String[] args) {
        ArrayList<Person> list1 = new ArrayList<>();
        Person a1 = new Person("何东蓓",21);
        Person a2 = new Person("周莉婷",20);
        list1.add(new Person("何东瓜",22));
        list1.add(new Person("何东西",23));
        list1.add(a1);
        list1.add(a2);
        System.out.println(list1);
        System.out.println("===================");
        Collections.sort(list1);
        System.out.println(list1);



    }
}
