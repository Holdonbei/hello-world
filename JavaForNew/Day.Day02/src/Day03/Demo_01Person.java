package Day03;

public class Demo_01Person {
    public static void main (String[] args){
        PersonalMessage PM = new PersonalMessage();
        PM.setAge(20);
        PM.setName("迪丽热巴");
        String abc = PM.getName();
        int age = PM.getAge();
        System.out.println(age);
        System.out.println(abc);
    }
}
