package Day09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo02 {
    public static void main(String[] args) throws ParseException {
        method1();
    }
    public static void method1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH mm ss");
        Date date = new Date();
        System.out.println(sdf.format(date));
        Date abc = sdf.parse("2000年06月05日20 20 20");
        System.out.println(abc);
    }
}
