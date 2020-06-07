package Day10;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,2,3,4,5,6,7,8,9,10);
        Collections.addAll(list1,19,123,124135,56,341,36,13,63,134,61631,134);

        Collections.sort(list1);
        System.out.println(list1);
        Collections.shuffle(list1);
        System.out.println("============");
        System.out.println(list1);
        System.out.println("=============");
        

    }
}
