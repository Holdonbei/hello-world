package Day03;

public class Demo05 {
    private String name;
    private int age;

    public Demo05(){
        System.out.println("无参方法顺利执行啦！");
    }
    public Demo05(String name,int age){
        System.out.println("全参方法顺利执行啦！");
        this.name = name;
        this.age = age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
