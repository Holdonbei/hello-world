package Day04;

public class zlt {
    public static void main(String[] args) {
        Student stu = new Student("周莉婷",20);
        stu.room = "初三二班";
        Student one = new Student("何东蓓",21);
        System.out.println(stu.getName() + stu.getAge() + stu.room);
        System.out.println(one.getName() + one.getAge() + one.room);
    }
}
