package Day09;

import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {
        method1();
    }

    private static void method1() {
        Date date = new Date();
        System.out.println(date);
        Date time = new Date(0L);
        System.out.println(time);
        long a =  date.getTime();
        System.out.println(a);
    }
}
