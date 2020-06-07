package Day03;
import java.util.ArrayList;
public class Demo07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("何东蓓");
        list.add("周莉婷");
        list.add("何周莉婷");

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
