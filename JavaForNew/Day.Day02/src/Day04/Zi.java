package Day04;

public class Zi extends Fu{
    int num = 20;
    public Zi(){
        super();//访问父类的构造方法
    }

    public void methodZi(){
        System.out.println(super.num);//访问父类的num值
    }
    public  void method(){
        super.method();//访问父类的method
        System.out.println("访问父类的method");
    }
}
