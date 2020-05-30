package ClassForPractice;
/*
先自己整理一下。我需要创建一个hero类，LOL里面有很多英雄，他们有属性和动作。
属性：
名字
血条
蓝条

动作：
守塔
杀人
打钱

对应到Java的类中，
成员变量：
name
hp
mp
成员方法：
public void defendtower( ) { }
public void kill( )  { }
public void makemoney( ) { }
*/
public class hero {
    String name;
    int hp,mp;

    public void defendtower() {
        System.out.println("请守护好这座塔。");
        System.out.println("恭喜你，成功守护了这座塔。");
    }
    public void kill() {
        System.out.println("追上那个落单的英雄，别让他跑了。");
        System.out.println("很可惜，他跑掉了。");
    }
    public void makemoney() {
        System.out.println("请好好补兵，赚钱养装备。");
    }


}
