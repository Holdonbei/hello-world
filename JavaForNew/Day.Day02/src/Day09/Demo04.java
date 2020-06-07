package Day09;

public class Demo04 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        int i;
        for (i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long b = System.currentTimeMillis();
        System.out.println("打印9999个数一共花费了时间为："+  (b-a) +"毫秒");
    }
}
