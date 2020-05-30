package ClassForPractice;
/*
这次创建一个演员吧
演员：
名字  年龄
 */

public class Privateues {
    String name;
    private  static int age;
    //getAge方法用来从类外部获取一个数值，随后将这个数值赋值给该类中的age
    //age变量被 private保护起来，因此当该类在外部被使用的时候，age无法被直接改变
    public static void getAge(int num) {
        if (num < 100 && num > 0) {
            age = num;
        } else {
            System.out.println("数据输入有误。");
        }
    }
    //returnAge 的方法用来将已经age数值返回给引用处
    public static int returnAge(){
        return age;
    }

}
