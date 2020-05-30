package ClassForPractice;

public class MethodReturn {
    public static void main(String[] args) {
    hero abc = lol();
    System.out.println(abc.hp);
    System.out.println(abc.mp);
    System.out.println(abc.name);
    }
    //lol这个方法不需要有参数传输进去，但在创建过程中需要注意一个返回类型的问题，
    // 这里返回类型为一个引用类型，他的名字叫hero，是我们创建的类
    public static hero lol (){
        hero abc = new hero();
        abc.hp = 100;
        abc.mp = 200;
        abc.name = "德玛西亚万岁！";

        return abc;
    }
}
