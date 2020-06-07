package Day08.Demo01;

public class Person {
    //Fu中已经完全继承了，Object类里面的内容，因此我可以在Person下创建Fu对象，接着调用Object类里面的toString方法
    public static void main(String[] args) {
        Fu fu = new Fu("Holdonbei",20);//父类构造方法时，不能使用void关键字
        String f = fu.toString();
        System.out.println(f);
        System.out.println("============");
        System.out.println(fu);


    }
}

