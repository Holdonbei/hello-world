package ClassForPractice;

public class Actor {
    public static void main(String[] args) {
        Privateues abc = new Privateues();
        abc.getAge(-10);
        System.out.println(abc.returnAge());
        abc.getAge(20);
        System.out.println(abc.returnAge());
    }
}
