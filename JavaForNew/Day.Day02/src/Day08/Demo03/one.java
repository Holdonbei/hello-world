package Day08.Demo03;

import java.util.Date;

public class one {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();

    }

    private static void demo03() {
        Date time = new Date();
        System.out.println(time.getTime());
    }

    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);
    }

    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
