package ClassForPractice;
/*
创建的类可以当做参数被送入方法中，接着再方法中，可以随意使用你需要的功能，在main方法只需要调用这个method就行，
这个方法的优点就是使main里面的代码更加简洁，让人看着更加的舒服
缺点就是main方法中仍然必须要使用new一个新的对象来包含这个类，也就是说在main方法中创建一个对象仍然是必不可缺的。
 */
public class Method {
    public static void main (String[] args){
        hero Hero = new hero();
        method(Hero);
    }
    public static void method(hero param){
        System.out.println(param.name);
        System.out.println(param.hp);
        System.out.println(param.mp);
        param.defendtower();
        param.kill();
        param.makemoney();

    }

}
