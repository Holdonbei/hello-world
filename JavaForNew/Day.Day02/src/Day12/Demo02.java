package Day12;

import java.util.Scanner;

public class Demo02 {
    //模拟一个登陆系统
    /*
    第一步：先在数组中存储一些用户信息（使用成员数组——保证方法中可以采访变量信息）
    第二步：使用scanner录入键盘输入的用户信息
    第三步：建立异常处理机制
     */
    private  static String[] name = {"易烊千玺","王俊凯","王源"};
    public static void main(String[] args) throws RegisterException {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        method(username);
    }
    //使用两个方法进行异常判断，一个是throw关键字判断（给JVM虚拟机处理），一个是try...catch判断（自己处理）
    private static void method(String username) throws RegisterException {
        //用throw方法
        for (String abc :name){
            if (!name.equals(username)){
                throw new RegisterException("用户名已经被占用，请更换一个用户名");
            }
        }
    }
}
