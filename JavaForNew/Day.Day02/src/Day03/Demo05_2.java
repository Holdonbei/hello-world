package Day03;

public class Demo05_2 {
    public static void main(String[] args) {
        Demo05[] array = new Demo05[2];
        //Java 里面定义数组的方式如上，与C语言大同小异，记住Java的数组定义方式！
        Demo05 a = new Demo05("何东蓓",21);
        Demo05 b = new Demo05("周莉婷",20);
        array[0] = a;
        array[1] = b;
        System.out.println(array[1]);
        System.out.println("我叫" + array[1].getName() + "我现在的年龄是"+ array[1].getAge());
    }
}
