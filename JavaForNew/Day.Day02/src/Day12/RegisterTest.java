package Day12;

import java.util.Scanner;

/*
为了使用刚刚自定义创建RegisterException，这里模拟用户注册的情形
1.创建数组存贮已经注册过的用户名信息
2.用scanner获取用户注册的用户名
3.对比用户注册的名字与数据库内的用户名，重名则跳出异常，否则顺利注册
 */
public class RegisterTest {
    static String[] arrayA = {"易烊千玺", "王俊凯", "王源"}; //第一步

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);//第二步
        String username = sc.next();//获取键盘输入
        method(username);

    }

    public static void method(String username)  {
        for (String name : arrayA) {
            if (name.equals(username)) {
                try{
                    throw new RegisterException("亲，用户已经被注册。");
                } catch (RegisterException e) {
                    e.printStackTrace();
                }
            }


        }
        System.out.println("恭喜您成功注册");
    }
}
