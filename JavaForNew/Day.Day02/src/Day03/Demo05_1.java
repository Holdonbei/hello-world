package Day03;

public class Demo05_1 {
    public static void main(String[] args) {
        Demo05 a = new Demo05();
        Demo05 b = new Demo05("何东蓓",21);
        a.setAge(20);
        a.setName("何东蓓");
        String str = a.getName();
        int num = a.getAge();
        System.out.println(str + num);
        System.out.println("==================");
        System.out.println(b.getAge()+b.getName());
    }
}
