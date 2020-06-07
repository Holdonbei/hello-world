package Day10;

public class Demo01 {
    public static void main(String[] args) {
        String a = new String("abc");
        String a1 = new String("avc");
        String b = new String("asd");
        int s = a.hashCode();
        System.out.println(s);
        int s1 = a1.hashCode();
        System.out.println(s1);
        int s2 = b.hashCode();
        System.out.println(s2);

    }
}
